/**
 * NOTE: This class is auto generated by the akka-scala (beta) swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen
 * For any issue or feedback, please open a ticket via https://github.com/swagger-api/swagger-codegen/issues/new
 */
package io.swagger.client.api

import io.swagger.client.model.Errors
import io.swagger.client.model.InlineResponse20043
import io.swagger.client.core._
import io.swagger.client.core.CollectionFormats._
import io.swagger.client.core.ApiKeyLocations._

object PaymentApi {

  /**
   * Returns the auth token what can be used to register the guest credit card and sumup user secret token
   * 
   * Expected answers:
   *   code 200 : InlineResponse20043 (tokens)
   *   code 400 : Errors (Bad Request)
   *   code 401 : Errors (Unauthorized)
   * 
   * Available security schemes:
   *   bodyHash (apiKey)
   *   consumerKey (apiKey)
   *   hmac (apiKey)
   *   hmacTimestamp (apiKey)
   *   hmacVersion (apiKey)
   *   sessionUuid (apiKey)
   */
  def guestSumUpTokensGet()(implicit apiKey: ApiKeyValue, apiKey: ApiKeyValue, apiKey: ApiKeyValue, apiKey: ApiKeyValue, apiKey: ApiKeyValue, apiKey: ApiKeyValue): ApiRequest[InlineResponse20043] =
    ApiRequest[InlineResponse20043](ApiMethods.GET, "https://virtserver.swaggerhub.com/SmartBear-CC/Natalie_TestAutoMock/1.0.0", "/guest/sum_up/tokens", "application/json")
      .withApiKey(apiKey, "X-Body-Hash", HEADER)
      .withApiKey(apiKey, "X-Consumer-Key", HEADER)
      .withApiKey(apiKey, "X-HMAC", HEADER)
      .withApiKey(apiKey, "X-HMAC-Timestamp", HEADER)
      .withApiKey(apiKey, "X-HMAC-Version", HEADER)
      .withApiKey(apiKey, "X-Session-Uuid", HEADER)
      .withSuccessResponse[InlineResponse20043](200)
      .withErrorResponse[Errors](400)
      .withErrorResponse[Errors](401)
      

}

