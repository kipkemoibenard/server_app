package io.getarays.server.model;

import io.getarays.server.enumaration.Status;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;

import static javax.persistence.GenerationType.AUTO;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Server {
    @Id
    @GeneratedValue(strategy = AUTO)
    private long id;

    @Column(unique = true)
    @NotEmpty(message = "IP address cannot be empty or Null")
    private String ipAddress;
    private String name;
    private String memory;
    private String type;
    private String imageUrl;
    private Status status;

    public Server(Long aLong, String ipAddress, String ubuntu_linux, String memory, String personal_pc, String imageUrl, Status serverUp) {
    }
}
