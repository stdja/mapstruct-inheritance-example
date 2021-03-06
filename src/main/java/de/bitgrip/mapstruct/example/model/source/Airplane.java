package de.bitgrip.mapstruct.example.model.source;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
 * <p>TODO Document!</p>
 * <p>
 * (w) marcelmuller<br/>
 * (c) bitgrip GmbH, 2018
 * </p>
 */
@Data
@ToString(callSuper = true)
public class Airplane extends FlyingVehicle {

  private String wings;

  @Builder
  public Airplane(String wings, Length maxAltitude, Break mainBreak, String id, List<String> transportationObjects,
                  Integer weight, Length width,
                  Length height, Length length) {
    super(maxAltitude, mainBreak, id, transportationObjects, weight, width, height, length);
    this.wings = wings;
  }
}
