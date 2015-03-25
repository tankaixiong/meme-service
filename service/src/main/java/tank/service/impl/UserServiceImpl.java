package tank.service.impl;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.transaction.annotation.Transactional;

import tank.domain.User;
import tank.repository.IUserRepository;
import tank.service.IUserService;

/**
 * @author tank
 * @date:18 Nov 2014 16:05:16
 * @description:
 * @version :1.0
 */
//@Service
public class UserServiceImpl implements IUserService {
	Logger logger=LoggerFactory.getLogger(UserServiceImpl.class);
	@Resource
	IUserRepository userRepository;
	
	@PostConstruct
	public void init(){
		logger.info("构造函数初始化后执行");
	}
	@PreDestroy
	public void destroy(){
		logger.info("销毁之前调用");
	}
	 

	/* (non-Javadoc)
	 * @see tank.meme.service.impl.IUserService#login(java.lang.String, java.lang.String)
	 */
	public User login(String name, String pwd) {
		 
		return userRepository.getByNameAndPwd(name, pwd);
	}

	/* (non-Javadoc)
	 * @see tank.meme.service.impl.IUserService#save(tank.meme.domain.User)
	 */
	@Transactional
	public User save(User user) {
		return userRepository.save(user);
	}
}
