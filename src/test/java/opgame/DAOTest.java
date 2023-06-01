package opgame;

import static org.junit.jupiter.api.Assertions.*;

import com.example.springbootgradle.study.opgame.model.Member;
import com.example.springbootgradle.study.opgame.model.MemberDAO;
import org.junit.jupiter.api.Test;

import java.util.Optional;

public class DAOTest {
    @Test
    public void testLoginAndLogout() {
        String id = "tester";
        String pw = "1234";

        MemberDAO dao = new MemberDAO();
        dao.initMember();
        Optional<Member> user = dao.login(id, pw);
        if(user.isEmpty()) {
            dao.join(id, pw);
            user = dao.login(id, pw);
        }

        assertEquals(id, user.get().getID());
        assertTrue(user.get().isLogined());

        user = dao.logout(id);
        assertFalse(user.get().isLogined());
    }
}
