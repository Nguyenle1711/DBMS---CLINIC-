package DBMS.demo.Repository;
import DBMS.demo.Model.Userinfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import java.util.List;
public interface UserRepository extends JpaRepository<Userinfo,Long> {
    @Query(value = "EXEC INSERT_ACCOUNT @NAME=:NAME ,@PASSWORD=:PASSWORD , @PHONE=:PHONE", nativeQuery = true)
    int insertAccount(
            String NAME,
            String PASSWORD,
            String PHONE
    );
    @Query(value = "EXEC view_user;",nativeQuery = true)
    List<Object[]> view();
}
