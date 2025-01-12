/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (7.10.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.usermanagement.controller;

import com.usermanagement.model.dto.UserCreateDto;
import com.usermanagement.model.dto.UserResponseDto;
import com.usermanagement.model.dto.UserUpdateDto;
import com.usermanagement.model.dto.UserUpdatePasswordDto;
import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.Parameters;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import jakarta.annotation.Generated;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-01-12T02:19:04.823758700+02:00[Africa/Cairo]", comments = "Generator version: 7.10.0")
@Validated
@Tag(name = "User Management", description = "the User Management API")
public interface UsersApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * POST /users : Create a new user
     *
     * @param userCreateDto Details of the new user to create (required)
     * @return User created successfully (status code 200)
     */
    @Operation(
        operationId = "createUser",
        summary = "Create a new user",
        tags = { "User Management" },
        responses = {
            @ApiResponse(responseCode = "200", description = "User created successfully", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = String.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/users",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    
    default ResponseEntity<String> createUser(
        @Parameter(name = "UserCreateDto", description = "Details of the new user to create", required = true) @Valid @RequestBody UserCreateDto userCreateDto
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "\"User added successfully.\"";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /users : Retrieve all users
     *
     * @return A list of all users (status code 200)
     */
    @Operation(
        operationId = "getAllUsers",
        summary = "Retrieve all users",
        tags = { "User Management" },
        responses = {
            @ApiResponse(responseCode = "200", description = "A list of all users", content = {
                @Content(mediaType = "application/json", array = @ArraySchema(schema = @Schema(implementation = UserResponseDto.class)))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/users",
        produces = { "application/json" }
    )
    
    default ResponseEntity<List<UserResponseDto>> getAllUsers(
        
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "[ { \"role\" : \"USER\", \"gender\" : \"MALE\", \"mobileNumber\" : \"01234567890\", \"fullName\" : \"John Doe\", \"id\" : 1, \"userName\" : \"JohnDoe\", \"email\" : \"john.doe@example.com\", \"status\" : \"ACTIVE\" }, { \"role\" : \"USER\", \"gender\" : \"MALE\", \"mobileNumber\" : \"01234567890\", \"fullName\" : \"John Doe\", \"id\" : 1, \"userName\" : \"JohnDoe\", \"email\" : \"john.doe@example.com\", \"status\" : \"ACTIVE\" } ]";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /users/{id} : Retrieve user details by ID
     *
     * @param id The unique ID of the user (required)
     * @return User details retrieved successfully (status code 200)
     */
    @Operation(
        operationId = "getUserById",
        summary = "Retrieve user details by ID",
        tags = { "User Management" },
        responses = {
            @ApiResponse(responseCode = "200", description = "User details retrieved successfully", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = UserResponseDto.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/users/{id}",
        produces = { "application/json" }
    )
    
    default ResponseEntity<UserResponseDto> getUserById(
        @Parameter(name = "id", description = "The unique ID of the user", required = true, in = ParameterIn.PATH) @PathVariable("id") Integer id
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"role\" : \"USER\", \"gender\" : \"MALE\", \"mobileNumber\" : \"01234567890\", \"fullName\" : \"John Doe\", \"id\" : 1, \"userName\" : \"JohnDoe\", \"email\" : \"john.doe@example.com\", \"status\" : \"ACTIVE\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * PUT /users/{id}/updatePassword : Update password for a user
     *
     * @param id The unique ID of the user whose password is to be updated (required)
     * @param userUpdatePasswordDto Request body for updating the password (required)
     * @return Password updated successfully (status code 200)
     */
    @Operation(
        operationId = "updatePassword",
        summary = "Update password for a user",
        tags = { "User Management" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Password updated successfully", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = String.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.PUT,
        value = "/users/{id}/updatePassword",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    
    default ResponseEntity<String> updatePassword(
        @Parameter(name = "id", description = "The unique ID of the user whose password is to be updated", required = true, in = ParameterIn.PATH) @PathVariable("id") Integer id,
        @Parameter(name = "UserUpdatePasswordDto", description = "Request body for updating the password", required = true) @Valid @RequestBody UserUpdatePasswordDto userUpdatePasswordDto
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "\"Password updated successfully.\"";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * PUT /users/{id} : Update an existing user
     *
     * @param id The unique ID of the user (required)
     * @param userUpdateDto Updated details of the user (required)
     * @return User updated successfully (status code 200)
     */
    @Operation(
        operationId = "updateUser",
        summary = "Update an existing user",
        tags = { "User Management" },
        responses = {
            @ApiResponse(responseCode = "200", description = "User updated successfully", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = String.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.PUT,
        value = "/users/{id}",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    
    default ResponseEntity<String> updateUser(
        @Parameter(name = "id", description = "The unique ID of the user", required = true, in = ParameterIn.PATH) @PathVariable("id") Integer id,
        @Parameter(name = "UserUpdateDto", description = "Updated details of the user", required = true) @Valid @RequestBody UserUpdateDto userUpdateDto
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "\"User updated successfully.\"";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
