package satiyorumSattim.com;

import java.util.ArrayList;

import satiyorumSattim.com.business.abstracts.ICustomerService;
import satiyorumSattim.com.business.concretes.CustomerManager;
import satiyorumSattim.com.business.concretes.RegisterWithManager;
import satiyorumSattim.com.business.concretes.SignInWithManager;
import satiyorumSattim.com.core.abstracts.RegisterService;
import satiyorumSattim.com.core.abstracts.SignInService;
import satiyorumSattim.com.core.concretes.JRegexManagerAdapter;
import satiyorumSattim.com.core.concretes.JRegisterGoogleAccountManagerAdapter;
import satiyorumSattim.com.core.concretes.JSignInGoogleAccountManagerAdapter;
import satiyorumSattim.com.core.concretes.SendManager;
import satiyorumSattim.com.dataAccess.abstracts.CustomerDao;
import satiyorumSattim.com.dataAccess.concretes.HibernateCustomerDao;
import satiyorumSattim.com.entities.conretes.Customer;
import satiyorumSattim.com.business.abstracts.ICustomerService;
import satiyorumSattim.com.business.concretes.CustomerManager;
import satiyorumSattim.com.core.abstracts.RegisterService;
import satiyorumSattim.com.core.concretes.JRegexManagerAdapter;
import satiyorumSattim.com.core.concretes.SendManager;
import satiyorumSattim.com.dataAccess.concretes.HibernateCustomerDao;
import satiyorumSattim.com.entities.conretes.Customer;
import satiyorumSattim.com.business.abstracts.ICustomerService;
import satiyorumSattim.com.business.concretes.CustomerManager;
import satiyorumSattim.com.core.abstracts.RegisterService;
import satiyorumSattim.com.core.concretes.JRegexManagerAdapter;
import satiyorumSattim.com.core.concretes.SendManager;
import satiyorumSattim.com.dataAccess.concretes.HibernateCustomerDao;
import satiyorumSattim.com.entities.conretes.Customer;
import satiyorumSattim.com.business.abstracts.ICustomerService;
import satiyorumSattim.com.business.concretes.CustomerManager;
import satiyorumSattim.com.core.abstracts.RegisterService;
import satiyorumSattim.com.core.concretes.JRegexManagerAdapter;
import satiyorumSattim.com.core.concretes.SendManager;
import satiyorumSattim.com.dataAccess.concretes.HibernateCustomerDao;
import satiyorumSattim.com.entities.conretes.Customer;
import satiyorumSattim.com.business.abstracts.ICustomerService;
import satiyorumSattim.com.business.concretes.CustomerManager;
import satiyorumSattim.com.core.abstracts.RegisterService;
import satiyorumSattim.com.core.concretes.JRegexManagerAdapter;
import satiyorumSattim.com.core.concretes.SendManager;
import satiyorumSattim.com.dataAccess.concretes.HibernateCustomerDao;
import satiyorumSattim.com.entities.conretes.Customer;
import satiyorumSattim.com.business.abstracts.ICustomerService;
import satiyorumSattim.com.business.concretes.CustomerManager;
import satiyorumSattim.com.core.abstracts.RegisterService;
import satiyorumSattim.com.core.concretes.JRegexManagerAdapter;
import satiyorumSattim.com.core.concretes.SendManager;
import satiyorumSattim.com.dataAccess.concretes.HibernateCustomerDao;
import satiyorumSattim.com.entities.conretes.Customer;
import satiyorumSattim.com.business.abstracts.ICustomerService;
import satiyorumSattim.com.business.concretes.CustomerManager;
import satiyorumSattim.com.core.abstracts.RegisterService;
import satiyorumSattim.com.core.concretes.JRegexManagerAdapter;
import satiyorumSattim.com.core.concretes.SendManager;
import satiyorumSattim.com.dataAccess.concretes.HibernateCustomerDao;
import satiyorumSattim.com.entities.conretes.Customer;
import satiyorumSattim.com.business.abstracts.ICustomerService;
import satiyorumSattim.com.business.concretes.CustomerManager;
import satiyorumSattim.com.core.abstracts.RegisterService;
import satiyorumSattim.com.core.concretes.JRegexManagerAdapter;
import satiyorumSattim.com.core.concretes.SendManager;
import satiyorumSattim.com.dataAccess.concretes.HibernateCustomerDao;
import satiyorumSattim.com.entities.conretes.Customer;
import satiyorumSattim.com.business.abstracts.ICustomerService;
import satiyorumSattim.com.business.concretes.CustomerManager;
import satiyorumSattim.com.core.abstracts.RegisterService;
import satiyorumSattim.com.core.concretes.JRegexManagerAdapter;
import satiyorumSattim.com.core.concretes.SendManager;
import satiyorumSattim.com.dataAccess.concretes.HibernateCustomerDao;
import satiyorumSattim.com.entities.conretes.Customer;
import satiyorumSattim.com.business.abstracts.ICustomerService;
import satiyorumSattim.com.business.concretes.CustomerManager;
import satiyorumSattim.com.core.abstracts.RegisterService;
import satiyorumSattim.com.core.concretes.JRegexManagerAdapter;
import satiyorumSattim.com.core.concretes.SendManager;
import satiyorumSattim.com.dataAccess.concretes.HibernateCustomerDao;
import satiyorumSattim.com.entities.conretes.Customer;
import satiyorumSattim.com.business.abstracts.ICustomerService;
import satiyorumSattim.com.business.concretes.CustomerManager;
import satiyorumSattim.com.core.abstracts.RegisterService;
import satiyorumSattim.com.core.concretes.JRegexManagerAdapter;
import satiyorumSattim.com.core.concretes.SendManager;
import satiyorumSattim.com.dataAccess.concretes.HibernateCustomerDao;
import satiyorumSattim.com.entities.conretes.Customer;
import satiyorumSattim.com.business.abstracts.ICustomerService;
import satiyorumSattim.com.business.concretes.CustomerManager;
import satiyorumSattim.com.core.abstracts.RegisterService;
import satiyorumSattim.com.core.concretes.JRegexManagerAdapter;
import satiyorumSattim.com.core.concretes.SendManager;
import satiyorumSattim.com.dataAccess.concretes.HibernateCustomerDao;
import satiyorumSattim.com.entities.conretes.Customer;
import satiyorumSattim.com.business.abstracts.ICustomerService;
import satiyorumSattim.com.business.concretes.CustomerManager;
import satiyorumSattim.com.core.abstracts.RegisterService;
import satiyorumSattim.com.core.concretes.JRegexManagerAdapter;
import satiyorumSattim.com.core.concretes.SendManager;
import satiyorumSattim.com.dataAccess.concretes.HibernateCustomerDao;
import satiyorumSattim.com.entities.conretes.Customer;
import satiyorumSattim.com.business.abstracts.ICustomerService;
import satiyorumSattim.com.business.concretes.CustomerManager;
import satiyorumSattim.com.core.abstracts.RegisterService;
import satiyorumSattim.com.core.concretes.JRegexManagerAdapter;
import satiyorumSattim.com.core.concretes.SendManager;
import satiyorumSattim.com.dataAccess.concretes.HibernateCustomerDao;
import satiyorumSattim.com.entities.conretes.Customer;
import satiyorumSattim.com.business.abstracts.ICustomerService;
import satiyorumSattim.com.business.concretes.CustomerManager;
import satiyorumSattim.com.core.abstracts.RegisterService;
import satiyorumSattim.com.core.concretes.JRegexManagerAdapter;
import satiyorumSattim.com.core.concretes.SendManager;
import satiyorumSattim.com.dataAccess.concretes.HibernateCustomerDao;
import satiyorumSattim.com.entities.conretes.Customer;
import satiyorumSattim.com.business.abstracts.ICustomerService;
import satiyorumSattim.com.business.concretes.CustomerManager;
import satiyorumSattim.com.core.abstracts.RegisterService;
import satiyorumSattim.com.core.concretes.JRegexManagerAdapter;
import satiyorumSattim.com.core.concretes.SendManager;
import satiyorumSattim.com.dataAccess.concretes.HibernateCustomerDao;
import satiyorumSattim.com.entities.conretes.Customer;
import satiyorumSattim.com.business.abstracts.ICustomerService;
import satiyorumSattim.com.business.concretes.CustomerManager;
import satiyorumSattim.com.core.abstracts.RegisterService;
import satiyorumSattim.com.core.concretes.JRegexManagerAdapter;
import satiyorumSattim.com.core.concretes.SendManager;
import satiyorumSattim.com.dataAccess.concretes.HibernateCustomerDao;
import satiyorumSattim.com.entities.conretes.Customer;
import satiyorumSattim.com.business.abstracts.ICustomerService;
import satiyorumSattim.com.business.concretes.CustomerManager;
import satiyorumSattim.com.core.abstracts.RegisterService;
import satiyorumSattim.com.core.concretes.JRegexManagerAdapter;
import satiyorumSattim.com.core.concretes.SendManager;
import satiyorumSattim.com.dataAccess.concretes.HibernateCustomerDao;
import satiyorumSattim.com.entities.conretes.Customer;
import satiyorumSattim.com.business.abstracts.ICustomerService;
import satiyorumSattim.com.business.concretes.CustomerManager;
import satiyorumSattim.com.core.abstracts.RegisterService;
import satiyorumSattim.com.core.concretes.JRegexManagerAdapter;
import satiyorumSattim.com.core.concretes.SendManager;
import satiyorumSattim.com.dataAccess.concretes.HibernateCustomerDao;
import satiyorumSattim.com.entities.conretes.Customer;
import satiyorumSattim.com.business.abstracts.ICustomerService;
import satiyorumSattim.com.business.concretes.CustomerManager;
import satiyorumSattim.com.core.abstracts.RegisterService;
import satiyorumSattim.com.core.concretes.JRegexManagerAdapter;
import satiyorumSattim.com.core.concretes.SendManager;
import satiyorumSattim.com.dataAccess.concretes.HibernateCustomerDao;
import satiyorumSattim.com.entities.conretes.Customer;
import satiyorumSattim.com.business.abstracts.ICustomerService;
import satiyorumSattim.com.business.concretes.CustomerManager;
import satiyorumSattim.com.core.abstracts.RegisterService;
import satiyorumSattim.com.core.concretes.JRegexManagerAdapter;
import satiyorumSattim.com.core.concretes.SendManager;
import satiyorumSattim.com.dataAccess.concretes.HibernateCustomerDao;
import satiyorumSattim.com.entities.conretes.Customer;
import satiyorumSattim.com.business.abstracts.ICustomerService;
import satiyorumSattim.com.business.concretes.CustomerManager;
import satiyorumSattim.com.core.abstracts.RegisterService;
import satiyorumSattim.com.core.concretes.JRegexManagerAdapter;
import satiyorumSattim.com.core.concretes.SendManager;
import satiyorumSattim.com.dataAccess.concretes.HibernateCustomerDao;
import satiyorumSattim.com.entities.conretes.Customer;
import satiyorumSattim.com.business.abstracts.ICustomerService;
import satiyorumSattim.com.business.concretes.CustomerManager;
import satiyorumSattim.com.core.abstracts.RegisterService;
import satiyorumSattim.com.core.concretes.JRegexManagerAdapter;
import satiyorumSattim.com.core.concretes.SendManager;
import satiyorumSattim.com.dataAccess.concretes.HibernateCustomerDao;
import satiyorumSattim.com.entities.conretes.Customer;
import satiyorumSattim.com.business.abstracts.ICustomerService;
import satiyorumSattim.com.business.concretes.CustomerManager;
import satiyorumSattim.com.core.abstracts.RegisterService;
import satiyorumSattim.com.core.concretes.JRegexManagerAdapter;
import satiyorumSattim.com.core.concretes.SendManager;
import satiyorumSattim.com.dataAccess.concretes.HibernateCustomerDao;
import satiyorumSattim.com.entities.conretes.Customer;
import satiyorumSattim.com.business.abstracts.ICustomerService;
import satiyorumSattim.com.business.concretes.CustomerManager;
import satiyorumSattim.com.core.abstracts.RegisterService;
import satiyorumSattim.com.core.concretes.JRegexManagerAdapter;
import satiyorumSattim.com.core.concretes.SendManager;
import satiyorumSattim.com.dataAccess.concretes.HibernateCustomerDao;
import satiyorumSattim.com.entities.conretes.Customer;
import satiyorumSattim.com.business.abstracts.ICustomerService;
import satiyorumSattim.com.business.concretes.CustomerManager;
import satiyorumSattim.com.core.abstracts.RegisterService;
import satiyorumSattim.com.core.concretes.JRegexManagerAdapter;
import satiyorumSattim.com.core.concretes.SendManager;
import satiyorumSattim.com.dataAccess.concretes.HibernateCustomerDao;
import satiyorumSattim.com.entities.conretes.Customer;
import satiyorumSattim.com.business.abstracts.ICustomerService;
import satiyorumSattim.com.business.concretes.CustomerManager;
import satiyorumSattim.com.core.abstracts.RegisterService;
import satiyorumSattim.com.core.concretes.JRegexManagerAdapter;
import satiyorumSattim.com.core.concretes.SendManager;
import satiyorumSattim.com.dataAccess.concretes.HibernateCustomerDao;
import satiyorumSattim.com.entities.conretes.Customer;
import satiyorumSattim.com.business.abstracts.ICustomerService;
import satiyorumSattim.com.business.concretes.CustomerManager;
import satiyorumSattim.com.core.abstracts.RegisterService;
import satiyorumSattim.com.core.concretes.JRegexManagerAdapter;
import satiyorumSattim.com.core.concretes.SendManager;
import satiyorumSattim.com.dataAccess.concretes.HibernateCustomerDao;
import satiyorumSattim.com.entities.conretes.Customer;
import satiyorumSattim.com.business.abstracts.ICustomerService;
import satiyorumSattim.com.business.concretes.CustomerManager;
import satiyorumSattim.com.core.abstracts.RegisterService;
import satiyorumSattim.com.core.concretes.JRegexManagerAdapter;
import satiyorumSattim.com.core.concretes.SendManager;
import satiyorumSattim.com.dataAccess.concretes.HibernateCustomerDao;
import satiyorumSattim.com.entities.conretes.Customer;
import satiyorumSattim.com.business.abstracts.ICustomerService;
import satiyorumSattim.com.business.concretes.CustomerManager;
import satiyorumSattim.com.core.abstracts.RegisterService;
import satiyorumSattim.com.core.concretes.JRegexManagerAdapter;
import satiyorumSattim.com.core.concretes.SendManager;
import satiyorumSattim.com.dataAccess.concretes.HibernateCustomerDao;
import satiyorumSattim.com.entities.conretes.Customer;
import satiyorumSattim.com.business.abstracts.ICustomerService;
import satiyorumSattim.com.business.concretes.CustomerManager;
import satiyorumSattim.com.core.abstracts.RegisterService;
import satiyorumSattim.com.core.concretes.JRegexManagerAdapter;
import satiyorumSattim.com.core.concretes.SendManager;
import satiyorumSattim.com.dataAccess.concretes.HibernateCustomerDao;
import satiyorumSattim.com.entities.conretes.Customer;
import satiyorumSattim.com.business.abstracts.ICustomerService;
import satiyorumSattim.com.business.concretes.CustomerManager;
import satiyorumSattim.com.core.abstracts.RegisterService;
import satiyorumSattim.com.core.concretes.JRegexManagerAdapter;
import satiyorumSattim.com.core.concretes.SendManager;
import satiyorumSattim.com.dataAccess.concretes.HibernateCustomerDao;
import satiyorumSattim.com.entities.conretes.Customer;
import satiyorumSattim.com.business.abstracts.ICustomerService;
import satiyorumSattim.com.business.concretes.CustomerManager;
import satiyorumSattim.com.core.abstracts.RegisterService;
import satiyorumSattim.com.core.concretes.JRegexManagerAdapter;
import satiyorumSattim.com.core.concretes.SendManager;
import satiyorumSattim.com.dataAccess.concretes.HibernateCustomerDao;
import satiyorumSattim.com.entities.conretes.Customer;
import satiyorumSattim.com.business.abstracts.ICustomerService;
import satiyorumSattim.com.business.concretes.CustomerManager;
import satiyorumSattim.com.core.abstracts.RegisterService;
import satiyorumSattim.com.core.concretes.JRegexManagerAdapter;
import satiyorumSattim.com.core.concretes.SendManager;
import satiyorumSattim.com.dataAccess.concretes.HibernateCustomerDao;
import satiyorumSattim.com.entities.conretes.Customer;
import satiyorumSattim.com.business.abstracts.ICustomerService;
import satiyorumSattim.com.business.concretes.CustomerManager;
import satiyorumSattim.com.core.abstracts.RegisterService;
import satiyorumSattim.com.core.concretes.JRegexManagerAdapter;
import satiyorumSattim.com.core.concretes.SendManager;
import satiyorumSattim.com.dataAccess.concretes.HibernateCustomerDao;
import satiyorumSattim.com.entities.conretes.Customer;
import satiyorumSattim.com.business.abstracts.ICustomerService;
import satiyorumSattim.com.business.concretes.CustomerManager;
import satiyorumSattim.com.core.abstracts.RegisterService;
import satiyorumSattim.com.core.concretes.JRegexManagerAdapter;
import satiyorumSattim.com.core.concretes.SendManager;
import satiyorumSattim.com.dataAccess.concretes.HibernateCustomerDao;
import satiyorumSattim.com.entities.conretes.Customer;
import satiyorumSattim.com.business.abstracts.ICustomerService;
import satiyorumSattim.com.business.concretes.CustomerManager;
import satiyorumSattim.com.core.abstracts.RegisterService;
import satiyorumSattim.com.core.concretes.JRegexManagerAdapter;
import satiyorumSattim.com.core.concretes.SendManager;
import satiyorumSattim.com.dataAccess.concretes.HibernateCustomerDao;
import satiyorumSattim.com.entities.conretes.Customer;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Customer customer=new Customer("Hasan", "G�der", "hguder.bm@gmail.com", "44444444");
ICustomerService customerService=new CustomerManager(new RegisterWithManager(new JRegexManagerAdapter(),new HibernateCustomerDao(),new SendManager()), new SignInWithManager(new HibernateCustomerDao())) ;
	
customerService.registerCustomer(customer);
//customerService.registerCustomer(customer);
	


	

}}