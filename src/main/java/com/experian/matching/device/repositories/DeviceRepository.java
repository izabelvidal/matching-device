package com.experian.matching.device.repositories;

import com.experian.matching.device.entities.Device;
import org.springframework.data.aerospike.repository.AerospikeRepository;

import java.util.UUID;

public interface DeviceRepository extends AerospikeRepository<Device, UUID> {
}
