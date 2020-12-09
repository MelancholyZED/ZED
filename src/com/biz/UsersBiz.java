package com.biz;

import com.dao.IUsersDao;

public class UsersBiz implements IUsersBiz {
   private IUsersDao usersdao;
   
	public IUsersDao getUsersdao() {
	return usersdao;
}

public void setUsersdao(IUsersDao usersdao) {
	this.usersdao = usersdao;
}

	@Override
	public void save() {
		System.out.println("¡Œ");
		usersdao.save();
	}

}
