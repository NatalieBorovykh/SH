/**
 * NOTE: This class is auto generated by the akka-scala (beta) swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen
 * For any issue or feedback, please open a ticket via https://github.com/swagger-api/swagger-codegen/issues/new
 */
package io.swagger.client.api

import io.swagger.client.model.CheckinResponse
import io.swagger.client.model.Errors
import java.io.File
import io.swagger.client.model.InlineResponse20027
import io.swagger.client.model.InlineResponse20028
import io.swagger.client.model.InlineResponse20034
import io.swagger.client.model.Rating
import io.swagger.client.core._
import io.swagger.client.core.CollectionFormats._
import io.swagger.client.core.ApiKeyLocations._

object CheckinApi {

  /**
   * 
   * 
   * Expected answers:
   *   code 200 : CheckinResponse (Checkin)
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
   * 
   * @param checkinId 
   */
  def guestCheckinsCheckinIdGet(checkinId: Int)(implicit apiKey: ApiKeyValue, apiKey: ApiKeyValue, apiKey: ApiKeyValue, apiKey: ApiKeyValue, apiKey: ApiKeyValue, apiKey: ApiKeyValue): ApiRequest[CheckinResponse] =
    ApiRequest[CheckinResponse](ApiMethods.GET, "https://virtserver.swaggerhub.com/SmartBear-CC/Natalie_TestAutoMock/1.0.0", "/guest/checkins/{checkin_id}", "application/json")
      .withApiKey(apiKey, "X-Body-Hash", HEADER)
      .withApiKey(apiKey, "X-Consumer-Key", HEADER)
      .withApiKey(apiKey, "X-HMAC", HEADER)
      .withApiKey(apiKey, "X-HMAC-Timestamp", HEADER)
      .withApiKey(apiKey, "X-HMAC-Version", HEADER)
      .withApiKey(apiKey, "X-Session-Uuid", HEADER)
      .withPathParam("checkin_id", checkinId)
      .withSuccessResponse[CheckinResponse](200)
      .withErrorResponse[Errors](400)
      .withErrorResponse[Errors](401)
        /**
   * Set checkin&#39;s rating. Checkin should be closed.
   * 
   * Expected answers:
   *   code 200 : CheckinResponse (Checkin)
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
   * 
   * @param checkinId 
   * @param rating 
   */
  def guestCheckinsCheckinIdRatingPatch(checkinId: Int, rating: Rating)(implicit apiKey: ApiKeyValue, apiKey: ApiKeyValue, apiKey: ApiKeyValue, apiKey: ApiKeyValue, apiKey: ApiKeyValue, apiKey: ApiKeyValue): ApiRequest[CheckinResponse] =
    ApiRequest[CheckinResponse](ApiMethods.PATCH, "https://virtserver.swaggerhub.com/SmartBear-CC/Natalie_TestAutoMock/1.0.0", "/guest/checkins/{checkin_id}/rating", "application/json")
      .withApiKey(apiKey, "X-Body-Hash", HEADER)
      .withApiKey(apiKey, "X-Consumer-Key", HEADER)
      .withApiKey(apiKey, "X-HMAC", HEADER)
      .withApiKey(apiKey, "X-HMAC-Timestamp", HEADER)
      .withApiKey(apiKey, "X-HMAC-Version", HEADER)
      .withApiKey(apiKey, "X-Session-Uuid", HEADER)
      .withBody(rating)
      .withPathParam("checkin_id", checkinId)
      .withSuccessResponse[CheckinResponse](200)
      .withErrorResponse[Errors](400)
      .withErrorResponse[Errors](401)
        /**
   * Get transactions related of a specific checkin.
   * 
   * Expected answers:
   *   code 200 : InlineResponse20028 (Transactions)
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
   * 
   * @param checkinId 
   */
  def guestCheckinsCheckinIdTransactionsGet(checkinId: Int)(implicit apiKey: ApiKeyValue, apiKey: ApiKeyValue, apiKey: ApiKeyValue, apiKey: ApiKeyValue, apiKey: ApiKeyValue, apiKey: ApiKeyValue): ApiRequest[InlineResponse20028] =
    ApiRequest[InlineResponse20028](ApiMethods.GET, "https://virtserver.swaggerhub.com/SmartBear-CC/Natalie_TestAutoMock/1.0.0", "/guest/checkins/{checkin_id}/transactions", "application/json")
      .withApiKey(apiKey, "X-Body-Hash", HEADER)
      .withApiKey(apiKey, "X-Consumer-Key", HEADER)
      .withApiKey(apiKey, "X-HMAC", HEADER)
      .withApiKey(apiKey, "X-HMAC-Timestamp", HEADER)
      .withApiKey(apiKey, "X-HMAC-Version", HEADER)
      .withApiKey(apiKey, "X-Session-Uuid", HEADER)
      .withPathParam("checkin_id", checkinId)
      .withSuccessResponse[InlineResponse20028](200)
      .withErrorResponse[Errors](400)
      .withErrorResponse[Errors](401)
        /**
   * 
   * 
   * Expected answers:
   *   code 200 : CheckinResponse (Checkin)
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
   * 
   * @param checkinId 
   * @param userSignature The file to upload.
   */
  def guestCheckinsCheckinIdUserSignaturePatch(checkinId: Int, userSignature: File)(implicit apiKey: ApiKeyValue, apiKey: ApiKeyValue, apiKey: ApiKeyValue, apiKey: ApiKeyValue, apiKey: ApiKeyValue, apiKey: ApiKeyValue): ApiRequest[CheckinResponse] =
    ApiRequest[CheckinResponse](ApiMethods.PATCH, "https://virtserver.swaggerhub.com/SmartBear-CC/Natalie_TestAutoMock/1.0.0", "/guest/checkins/{checkin_id}/user_signature", "multipart/form-data")
      .withApiKey(apiKey, "X-Body-Hash", HEADER)
      .withApiKey(apiKey, "X-Consumer-Key", HEADER)
      .withApiKey(apiKey, "X-HMAC", HEADER)
      .withApiKey(apiKey, "X-HMAC-Timestamp", HEADER)
      .withApiKey(apiKey, "X-HMAC-Version", HEADER)
      .withApiKey(apiKey, "X-Session-Uuid", HEADER)
      .withFormParam("user_signature", userSignature)
      .withPathParam("checkin_id", checkinId)
      .withSuccessResponse[CheckinResponse](200)
      .withErrorResponse[Errors](400)
      .withErrorResponse[Errors](401)
        /**
   * 
   * 
   * Expected answers:
   *   code 200 : InlineResponse20027 (Checkins)
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
   * 
   * @param sinceTimestamp iso8601 with 3 digits precision: \&quot;2016-04-06T15:00:00.001+02:00\&quot;
   * @param untilTimestamp iso8601 with 3 digits precision: \&quot;2016-04-06T15:00:00.001+02:00\&quot;
   * @param limit 
   */
  def guestCheckinsGet(sinceTimestamp: Option[String] = None, untilTimestamp: Option[String] = None, limit: Option[Int] = None)(implicit apiKey: ApiKeyValue, apiKey: ApiKeyValue, apiKey: ApiKeyValue, apiKey: ApiKeyValue, apiKey: ApiKeyValue, apiKey: ApiKeyValue): ApiRequest[InlineResponse20027] =
    ApiRequest[InlineResponse20027](ApiMethods.GET, "https://virtserver.swaggerhub.com/SmartBear-CC/Natalie_TestAutoMock/1.0.0", "/guest/checkins", "application/json")
      .withApiKey(apiKey, "X-Body-Hash", HEADER)
      .withApiKey(apiKey, "X-Consumer-Key", HEADER)
      .withApiKey(apiKey, "X-HMAC", HEADER)
      .withApiKey(apiKey, "X-HMAC-Timestamp", HEADER)
      .withApiKey(apiKey, "X-HMAC-Version", HEADER)
      .withApiKey(apiKey, "X-Session-Uuid", HEADER)
      .withQueryParam("since_timestamp", sinceTimestamp)
      .withQueryParam("until_timestamp", untilTimestamp)
      .withQueryParam("limit", limit)
      .withSuccessResponse[InlineResponse20027](200)
      .withErrorResponse[Errors](400)
      .withErrorResponse[Errors](401)
        /**
   * Mobile checkin. Works with PMS enabled venues only
   * 
   * Expected answers:
   *   code 200 : InlineResponse20034 (Reservations Data)
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
   * 
   * @param id ID of reservation to sync transaction with
   */
  def guestReservationsIdMobileCheckinPost(id: Long)(implicit apiKey: ApiKeyValue, apiKey: ApiKeyValue, apiKey: ApiKeyValue, apiKey: ApiKeyValue, apiKey: ApiKeyValue, apiKey: ApiKeyValue): ApiRequest[InlineResponse20034] =
    ApiRequest[InlineResponse20034](ApiMethods.POST, "https://virtserver.swaggerhub.com/SmartBear-CC/Natalie_TestAutoMock/1.0.0", "/guest/reservations/{id}/mobile_checkin", "application/json")
      .withApiKey(apiKey, "X-Body-Hash", HEADER)
      .withApiKey(apiKey, "X-Consumer-Key", HEADER)
      .withApiKey(apiKey, "X-HMAC", HEADER)
      .withApiKey(apiKey, "X-HMAC-Timestamp", HEADER)
      .withApiKey(apiKey, "X-HMAC-Version", HEADER)
      .withApiKey(apiKey, "X-Session-Uuid", HEADER)
      .withPathParam("id", id)
      .withSuccessResponse[InlineResponse20034](200)
      .withErrorResponse[Errors](400)
      .withErrorResponse[Errors](401)
      

}

