# farm
Its just for practice spring mvc
@GetMapping("/farmers/users/{KKDfarmerId}"}
public void getFarmerDetails(){
return new sanchitgetFun();
}

@PutMapping("/farmers/users/{KKDfarmerId}"}
public void updateFarmerAddressAndMobileNo(){
return new sanchitputFun();
}

@DeleteMapping("/farmers/users/{KKDfarmerId}"}
public void deleteFarmerDetails(){
return new sanchitdeleteFun();
}

@PutMapping("/farmers/users/{MobileNo}"}
public void updateFarmerPassword(){
return new sanchitupdateFun();
}

create a bean having
id name address mobile no alternate etc

Create FarmerDetailsProxy

create a service for rabbit MQ

