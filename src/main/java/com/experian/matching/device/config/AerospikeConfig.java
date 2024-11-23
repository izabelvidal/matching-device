package com.experian.matching.device.config;

import com.aerospike.client.Host;
import com.experian.matching.device.repositories.DeviceRepository;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.aerospike.config.AbstractAerospikeDataConfiguration;
import org.springframework.data.aerospike.repository.config.EnableAerospikeRepositories;

import java.util.Collection;
import java.util.Collections;

@Configuration
@EnableAerospikeRepositories(basePackageClasses = {DeviceRepository.class})
public class AerospikeConfig extends AbstractAerospikeDataConfiguration {
    @Override
    protected Collection<Host> getHosts() {
        return Collections.singleton(new Host("localhost", 3000));
    }

    @Override
    protected String nameSpace() {
        return "test";
    }
}
