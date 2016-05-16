package com.fantasy.modules.userManage.dao;

import java.util.List;

import com.fantasy.modules.userManage.model.User;

public interface IUserDao {
	/**
	 * ����û�
	 * 
	 * @param user
	 */
	public void add(User user);

	/**
	 * ɾ���û�
	 * 
	 * @param user
	 */
	public void delete(User user);

	/**
	 * �����û�
	 * 
	 * @param user
	 */
	public void update(User user);

	/**
	 * ��ѯ�û�
	 * 
	 * @param user
	 * @return
	 */
	public User userQuery(User user);

	/**
	 * ��ѯ�����û�
	 * 
	 * @return
	 */
	public List<User> userQueryAll();

	/**
	 * ģ����ѯ�û�
	 * 
	 * @param user
	 * @return
	 */
	public List<User> userFuzzyQuery(User user);

	/**
	 * ��ȡ�û����userId
	 * 
	 * @return
	 */
	public String maxUserId();
}
