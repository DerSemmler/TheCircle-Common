package org.thecircle.common.models;

import lombok.*;

import java.util.Date;

/**
 * MessageObject
 * @author samuel
 * @version 24.11.2020
 */

@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
public class Message {

    private String content;

    private String senderUsername;

    private String receiverUsername;

    private Date date;

}
