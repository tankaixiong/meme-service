package tank.repository.impl;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import tank.domain.Setting;
import tank.repository.ISettingRepository;

/**
 * @author tank
 * @email kaixiong.tan@qq.com
 * @date:2015年3月23日 上午11:15:57
 * @description:
 * @version :0.1
 */
@Repository
public class SettingRepository implements ISettingRepository {
	@PersistenceContext
	private EntityManager em;

	public Setting save(Setting setting) {
		em.persist(setting);
		return setting;
	}

	public Setting findOne(String key) {
		return em.find(Setting.class, key);
	}

}
