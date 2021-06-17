package com.indictrans.services;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.indictrans.Dao.BillDao;
import com.indictrans.Dao.CommissionTableDao;
import com.indictrans.bean.BillBean;
import com.indictrans.model.Agent;
import com.indictrans.model.Bill;
import com.indictrans.model.CommissionTable;
import com.indictrans.model.Customer;
import com.indictrans.model.CustomerBookedBlock;
import com.indictrans.model.FinancialYear;

@Service
public class BillServiceImpl implements BillService {
	@Autowired
	private BillDao billDao;
	@Autowired
	private CommissionTableService commissionTableService;
	@Autowired
	private CustomerService customerService;
	@Autowired
	private AgentService agentService;
	@Autowired
	private CustomerBookedBlockService customerBookedBlockService;
	@Autowired
	private FinancialYearService financialYearService;
	@Autowired
	private CommissionTableDao commissionTableDao;
	@Override
	public List<Bill> getData() {
		// TODO Auto-generated method stub
		List<Bill> bill = new ArrayList<Bill>();
		billDao.findAll().forEach(bill1 -> bill.add(bill1));
		return bill;
	}

	@Override
	public Bill saveData(BillBean billBean) {
		// TODO Auto-generated method stub
		Bill bill = new Bill();
		try {
			      List<CommissionTable> findAll = commissionTableDao.findAll();
		
			//CommissionTable commissionTable = commissionTableService.findById(billBean.getCommiTableId());
			//CustomerBookedBlock customerBookedBlock = customerBookedBlockService.findByAgeIdAndCustId(billBean.getAgeId(),billBean.getCustId());
			//System.out.println("========================"+customerBookedBlock);
			FinancialYear financialYear = financialYearService.findById(billBean.getfYearId());
			List<CommissionTable> commissionTables=new ArrayList<CommissionTable>();
			
			bill.setId(billBean.getId());
			CustomerBookedBlock customerBookedBlock=customerBookedBlockService.findById(billBean.getCustomerBookedBlockId());
			//cust
			//bill.(commissionTable);
			//bill.setAgeId(agentEntity);
			//bill.setCustId(customerEntity);
			
		bill.setCustomerBookedBlockId(customerBookedBlock);
			//new SimpleDateFormat("dd/MM/yyyy").parse(billBean.getBillDate())
			bill.setfYearId(financialYear);
			bill.setBillDate(new Date());
			if(customerBookedBlock.getBookDate().compareTo(financialYear.getFromDate())>=0 && customerBookedBlock.getBookDate().compareTo(financialYear.getToDate())<0)
			{
				findAll.forEach(e->{
					long id= (long)(e.getId());
				
				  if(customerBookedBlock.getBookDate().compareTo(e.getFromDate())>0 && customerBookedBlock.getBookDate().compareTo(e.getToDate())<0)
				  {
					  System.out.println("==================="+customerBookedBlock.getBookDate());
					 System.out.println("==========********========"+customerBookedBlock.getCustAreaBook());
					  if(e.getType()==1)
					  {
						  System.out.println("=================="+e.getType());
						  if((customerBookedBlock.getCustAreaBook()>=e.getFromArea()) && customerBookedBlock.getCustAreaBook()<e.getToArea()) 
						  {
							  System.out.println("=======0-600=====");
							  	bill.setCommissionAmount(e.getFixed());
							  	bill.setAgeId(customerBookedBlock.getAgeId());
							  	bill.setCustId(customerBookedBlock.getCustId());
							  //	bill.setCustomerBookedBlockId(customerBookedBlock);
							    bill.setCommissionInPer(e.getPercentage());	
							    
							   bill.setCommiTableId(e);
							  //	bill.setCommiTableId();
				          } 
						 
						
						/*
						 * else if((customerBookedBlock.getCustAreaBook()>=e.getFromArea()) &&
						 * customerBookedBlock.getCustAreaBook()<e.getToArea()) {
						 * 
						 * System.out.println("=======601-1000=====");
						 * bill.setCommissionAmount(e.getFixed());
						 * bill.setCommissionInPer(e.getPercentage()); } else
						 * if((customerBookedBlock.getCustAreaBook()>=e.getFromArea())
						 * &&customerBookedBlock.getCustAreaBook()<e.getToArea()) {
						 * System.out.println("=======1000-10000=====");
						 * bill.setCommissionAmount(e.getFixed());
						 * bill.setCommissionInPer(e.getPercentage()); } else
						 * if((customerBookedBlock.getCustAreaBook()>=e.getFromArea())
						 * &&customerBookedBlock.getCustAreaBook()<e.getToArea()) {
						 * System.out.println("=======10000-9999999999=====");
						 * bill.setCommissionAmount(e.getFixed());
						 * bill.setCommissionInPer(e.getPercentage()); }
						 */
				 }
					 
				else if(e.getType()==2) 
				{
				  if((customerBookedBlock.getCustAreaBook()>=e.getFromArea()) &&customerBookedBlock.getCustAreaBook()<e.getToArea())
				  {
					  System.out.println("=================="+e.getType());
					  System.out.println("=======0-600=====");
					  bill.setCommissionAmount(e.getFixed());
					  bill.setCommissionInPer(e.getPercentage());	
					  //bill.setCustomerBookedBlockId(customerBookedBlock);
					bill.setAgeId(customerBookedBlock.getAgeId());
					  bill.setCommiTableId(e);
						bill.setCustId(customerBookedBlock.getCustId());
					 
						} /*
							 * else if((customerBookedBlock.getCustAreaBook()>=e.getFromArea())
							 * &&customerBookedBlock.getCustAreaBook()<e.getToArea()) {
							 * System.out.println("=======601-1000=====");
							 * bill.setCommissionAmount(e.getFixed());
							 * bill.setCommissionInPer(e.getPercentage()); } else
							 * if((customerBookedBlock.getCustAreaBook()>=e.getFromArea())
							 * &&customerBookedBlock.getCustAreaBook()<e.getToArea()) {
							 * System.out.println("=======1000-10000=====");
							 * bill.setCommissionAmount(e.getFixed());
							 * bill.setCommissionInPer(e.getPercentage()); } else
							 * if((customerBookedBlock.getCustAreaBook()>=e.getFromArea()) &&
							 * customerBookedBlock.getCustAreaBook()<e.getToArea()) {
							 * System.out.println("=======10000-9999999999=====");
							 * bill.setCommissionAmount(e.getFixed());
							 * bill.setCommissionInPer(e.getPercentage()); }
							 */
				} 
						 
				else if(e.getType()==3) 
				{
					System.out.println("=================="+e.getType());
				  if((customerBookedBlock.getCustAreaBook()>=e.getFromArea()) &&customerBookedBlock.getCustAreaBook()<e.getToArea())
				  {
					  System.out.println("=======0-600=====");
					  System.out.println("=======commission Amount="+e.getFixed());
					  System.out.println("=========per commission===="+e.getPercentage());
					  bill.setCommissionAmount(e.getFixed());
					  bill.setCommissionInPer(e.getPercentage());	
					  bill.setCommiTableId(e);
					  bill.setCustomerBookedBlockId(customerBookedBlock);
						bill.setAgeId(customerBookedBlock.getAgeId());
						bill.setCustId(customerBookedBlock.getCustId());
					  
				  } 
						/*
						 * else if((customerBookedBlock.getCustAreaBook()>=e.getFromArea())
						 * &&customerBookedBlock.getCustAreaBook()<e.getToArea()) {
						 * System.out.println("=======601-1000=====");
						 * 
						 * bill.setCommissionAmount(e.getFixed());
						 * bill.setCommissionInPer(e.getPercentage()); } else
						 * if((customerBookedBlock.getCustAreaBook()>=e.getFromArea())
						 * &&customerBookedBlock.getCustAreaBook()<e.getToArea()) {
						 * System.out.println("=======1000-10000=====");
						 * bill.setCommissionAmount(e.getFixed());
						 * bill.setCommissionInPer(e.getPercentage()); } else
						 * if((customerBookedBlock.getCustAreaBook()>=e.getFromArea()) &&
						 * customerBookedBlock.getCustAreaBook()<e.getToArea()) {
						 * System.out.println("=======10000-9999999999=====");
						 * bill.setCommissionAmount(e.getFixed());
						 * bill.setCommissionInPer(e.getPercentage());
						 * 
						 * }
						 */
				  
				} 
				  }
				 			});


			billDao.save(bill);

			}	
		} catch (Exception e) {
			e.printStackTrace();
		}
		return bill;
		

	}



}
