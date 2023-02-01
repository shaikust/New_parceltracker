package com.updatedparceltracker.controller;

import com.updatedparceltracker.dto.JwtResponse;
import com.updatedparceltracker.model.Parcel;
import com.updatedparceltracker.model.User;
import com.updatedparceltracker.repository.ParcelRepository;
import com.updatedparceltracker.services.AdminUserControllerService;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;


import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@SpringBootTest(classes = {AdminUserControllerTest.class})
public class AdminUserControllerTest {
  @Mock
  private ParcelRepository parcelRepository;
  @InjectMocks
  private AdminUserControllerService controllerService;

  public List<Parcel> parcels=new ArrayList<>();
  public Set<User> users;


//  @Test
//  public void test_addParcel() {
//    Parcel parcel = new Parcel(1, "klm", "ekm", "pkd", "notdeliverd", new User());
//    when(parcelRepository.save(parcel)).thenReturn();
//    assertEquals(ResponseEntity.ok(new JwtResponse("[" + parcel.getTrackingId() + "]" + " added successfully")), controllerService.addParcel(parcel));
//
//
//  }
  @Test
  public void test_parcel_list(){
    parcels.add(new Parcel(1,"klm","tvm","klm","no", (User) users));
    when(parcelRepository.findAll()).thenReturn(parcels);
    assertEquals(parcels,controllerService.getAllParcel().getBody());


  }
}
