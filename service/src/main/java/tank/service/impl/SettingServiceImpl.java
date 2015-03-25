package tank.service.impl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tank.domain.Setting;
import tank.repository.ISettingRepository;
import tank.service.ISettingService;

/**
 * @author tank
 * @email kaixiong.tan@qq.com
 * @date:2015年3月23日 上午10:42:26
 * @description:
 * @version :0.1
 */
@Service
public class SettingServiceImpl implements ISettingService {
	@Autowired
	private ISettingRepository settingRepository;

	public Setting loadEntity(String key) {
		return settingRepository.findOne(key);

	}

	@Transactional
	public void save(Setting pojo) {
		settingRepository.save(pojo);
	}

}
