# farm
Its just for practice spring mvc

private Logger logger = LoggerFactory.getLogger(this.getClass());
	
@Autowired
private CustomerDetailsServiceProxy proxy;
	
@HystrixCommand(fallbackMethod="fallBackFarmerDetails")
@GetMapping("/farmers/users/{KKDfarmerId}"}
public void getFarmerDetails(){
logger.info("{}", "Getting farmer details");
FarmerDetailsBean details=proxy.sanchitMethod(farmerDetailsBean);
return details;
}

@HystrixCommand(fallbackMethod="fallBackFarmerDetails")
@PutMapping("/farmers/users/{KKDfarmerId}"}
public void updateFarmerAddressAndMobileNo(){
logger.info("{}", "Getting farmer details");
FarmerDetailsBean update=proxy.sanchitMethod(farmerDetailsBean);
return update;
}

@HystrixCommand(fallbackMethod="fallBackFarmerDetails")
@DeleteMapping("/farmers/users/{KKDfarmerId}"}
public void deleteFarmerDetails(){
logger.info("{}", "Getting farmer details");
FarmerDetailsBean delete=proxy.sanchitMethod(farmerDetailsBean);
return delete;
}

@HystrixCommand(fallbackMethod="fallBackFarmerDetails")
@PutMapping("/farmers/users/{MobileNo}"}
public void updateFarmerPassword(){
logger.info("{}", "Getting farmer details");
FarmerDetailsBean update=proxy.sanchitMethod(farmerDetailsBean);
return update;
}

create a bean having
id name address mobile no alternate etc
generate its getter setter constuctor and tostring methods

@FeignClient(name="Farmer-details-service")
@RibbonClient(name="Farmer-details-service")
public interface FarmerDetailsServiceProxy {
	
	@GetMapping("/farmers/users/{KKDfarmerId}")
	public FarmerDetailsBean sanchitgetFun()(FarmerDetailsBean farmerDetailsBean);
  
  @PutMapping("/farmers/users/{KKDfarmerId}")
	public FarmerDetailsBean sanchitupdateFun()(FarmerDetailsBean farmerDetailsBean);
  
  @DeleteMapping("/farmers/users/{KKDfarmerId}")
	public FarmerDetailsBean sanchitdeleteFun()(FarmerDetailsBean farmerDetailsBean);
  
  @PutMapping("/farmers/users/{MobileNo}")
	public FarmerDetailsBean sanchitupdateFun()(FarmerDetailsBean farmerDetailsBean);
  
}

create a service for rabbit MQ

