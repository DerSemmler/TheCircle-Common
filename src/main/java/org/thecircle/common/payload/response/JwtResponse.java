package org.thecircle.fckcducommon.payload.response;

import lombok.*;

/**
 * Payload for Delivering Jwt (JSON Web Token) to the client
 * @see "https://github.com/bezkoder/spring-boot-spring-security-jwt-authentication/blob/master/src/main/java/com/bezkoder/springjwt/payload/response/JwtResponse.java"
 * @author samuel
 * @version 27.11.2020
 */


@Getter
@Setter
@NoArgsConstructor
@RequiredArgsConstructor
@AllArgsConstructor
public class JwtResponse {

	@NonNull
	private String token;

	private String type = "Bearer";

	@NonNull
	private Long id;

	@NonNull
	private String username;
}