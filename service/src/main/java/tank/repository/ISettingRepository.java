package tank.repository;

import tank.domain.Setting;

/**
 * @author tank
 * @email kaixiong.tan@qq.com
 * @date:2015年3月23日 上午10:24:48
 * @description:
 * @version :0.1
 */

public interface ISettingRepository {//extends CrudRepository<Setting, String> {

	Setting save(Setting setting);

	Setting findOne(String key);
}
