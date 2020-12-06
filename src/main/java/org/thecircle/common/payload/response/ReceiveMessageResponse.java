package org.thecircle.common.payload.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.thecircle.common.payload.MessagePayload;

import java.util.ArrayList;


@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
public class ReceiveMessageResponse {
    private ArrayList<MessagePayload> messages;

}
