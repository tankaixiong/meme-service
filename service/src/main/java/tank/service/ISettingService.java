package tank.service;

import tank.domain.Setting;

/**
 * @author tank
 * @email kaixiong.tan@qq.com
 * @date:2015年3月23日 上午10:42:01
 * @description:
 * @version :0.1
 */

public interface ISettingService {

	public Setting loadEntity(String key);
	
	public void save(Setting pojo);
}
