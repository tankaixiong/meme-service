package tank.repository.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import tank.domain.User;
import tank.repository.IUserRepository;

/**
 * @author tank
 * @email kaixiong.tan@qq.com
 * @date:2015年3月22日 上午11:50:20
 * @description:
 * @version :0.1
 */
// @Repository
public class UserImpl implements IUserRepository {
	@PersistenceContext
	private EntityManager em;

	public List<User> findById(String id) {
		return null;
	}

	public List<User> findByNameAndPwd(String name, String pwd) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<User> findByCreateTime(String createTime) {
		// TODO Auto-generated method stub
		return null;
	}

	public User getByNameAndPwd(String name, String pwd) {
		Query query = em.createQuery("select u from User u where u.name=:name and u.pwd=:pwd ");
		query.setParameter("name", name);
		query.setParameter("pwd", pwd);
		if (query.getResultList().size() == 0) {
			return null;
		} else {
			return (User) query.getSingleResult();
		}

	}

	public User save(User user) {
		em.persist(user);
		return user;
	}

}
