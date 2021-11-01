package dave.springframework.msscbrewery.web.mappers;

import dave.springframework.msscbrewery.domain.Customer;
import dave.springframework.msscbrewery.web.model.CustomerDto;
import org.mapstruct.Mapper;

@Mapper
public interface CustomerMapper {
    CustomerDto customerToCustomerDto(Customer customer);
    Customer customerDtoToCustomer(CustomerDto customerDto);
}
