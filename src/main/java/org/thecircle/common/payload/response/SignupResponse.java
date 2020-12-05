package org.thecircle.common.payload.response;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor
public class SignupResponse {

	private long userId;

	@NonNull
	private String message;

}
