package com.fantasy.modules.userManage.service;

import java.util.List;

import com.fantasy.modules.userManage.model.User;

public interface IUserService {
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
	 * �����û�Ȩ��
	 * 
	 * @param user
	 */
	public void updateUserAuth(User user);
	
	/**
	 * ��������
	 * @param user
	 */
	public void updatePwd(User user);

	/**
	 * �û���½��ѯ
	 * 
	 * @param user
	 * @return
	 */
	public User loginQuery(User user);

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
	 * ��ѯ�û�
	 * 
	 * @param user
	 * @return
	 */
	public User userQuery(User user);
	
	/**
	 * ��ȡ�û����userId
	 * 
	 * @return
	 */
	public String maxUserId();
}
