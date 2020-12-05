package org.thecircle.common.payload.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.thecircle.common.models.Message;

import java.util.ArrayList;

@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
public class ReceiveMessageResponse {
    private ArrayList<Message> messages;
}
