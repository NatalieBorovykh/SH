/**
 * NOTE: This class is auto generated by the akka-scala (beta) swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen
 * For any issue or feedback, please open a ticket via https://github.com/swagger-api/swagger-codegen/issues/new
 */
package io.swagger.client.api

import io.swagger.client.model.Errors
import io.swagger.client.model.FilterAndSorting
import io.swagger.client.model.InlineResponse20023
import io.swagger.client.model.InlineResponse20024
import io.swagger.client.model.InlineResponse20025
import io.swagger.client.model.InlineResponse20026
import io.swagger.client.model.Preference1
import io.swagger.client.model.Preference2
import io.swagger.client.model.PreferenceIds
import io.swagger.client.model.PreferenceIds1
import io.swagger.client.model.PreferenceResponse
import io.swagger.client.core._
import io.swagger.client.core.CollectionFormats._
import io.swagger.client.core.ApiKeyLocations._

object PreferenceApi {

  /**
   * 
   * 
   * Expected answers:
   *   code 200 : InlineResponse20023 (preferences)
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
   * @param filterAndSorting 
   */
  def guestPreferencesGet(filterAndSorting: Option[FilterAndSorting] = None)(implicit apiKey: ApiKeyValue, apiKey: ApiKeyValue, apiKey: ApiKeyValue, apiKey: ApiKeyValue, apiKey: ApiKeyValue, apiKey: ApiKeyValue): ApiRequest[InlineResponse20023] =
    ApiRequest[InlineResponse20023](ApiMethods.GET, "https://virtserver.swaggerhub.com/SmartBear-CC/Natalie_TestAutoMock/1.0.0", "/guest/preferences", "application/json")
      .withApiKey(apiKey, "X-Body-Hash", HEADER)
      .withApiKey(apiKey, "X-Consumer-Key", HEADER)
      .withApiKey(apiKey, "X-HMAC", HEADER)
      .withApiKey(apiKey, "X-HMAC-Timestamp", HEADER)
      .withApiKey(apiKey, "X-HMAC-Version", HEADER)
      .withApiKey(apiKey, "X-Session-Uuid", HEADER)
      .withBody(filterAndSorting)
      .withSuccessResponse[InlineResponse20023](200)
      .withErrorResponse[Errors](400)
      .withErrorResponse[Errors](401)
        /**
   * 
   * 
   * Expected answers:
   *   code 200 : InlineResponse20024 (status)
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
   * @param id 
   */
  def guestPreferencesIdDelete(id: Double)(implicit apiKey: ApiKeyValue, apiKey: ApiKeyValue, apiKey: ApiKeyValue, apiKey: ApiKeyValue, apiKey: ApiKeyValue, apiKey: ApiKeyValue): ApiRequest[InlineResponse20024] =
    ApiRequest[InlineResponse20024](ApiMethods.DELETE, "https://virtserver.swaggerhub.com/SmartBear-CC/Natalie_TestAutoMock/1.0.0", "/guest/preferences/{id}", "application/json")
      .withApiKey(apiKey, "X-Body-Hash", HEADER)
      .withApiKey(apiKey, "X-Consumer-Key", HEADER)
      .withApiKey(apiKey, "X-HMAC", HEADER)
      .withApiKey(apiKey, "X-HMAC-Timestamp", HEADER)
      .withApiKey(apiKey, "X-HMAC-Version", HEADER)
      .withApiKey(apiKey, "X-Session-Uuid", HEADER)
      .withPathParam("id", id)
      .withSuccessResponse[InlineResponse20024](200)
      .withErrorResponse[Errors](400)
      .withErrorResponse[Errors](401)
        /**
   * 
   * 
   * Expected answers:
   *   code 200 : PreferenceResponse (preference)
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
   * @param id 
   * @param preference 
   */
  def guestPreferencesIdPut(id: Double, preference: Option[Preference2] = None)(implicit apiKey: ApiKeyValue, apiKey: ApiKeyValue, apiKey: ApiKeyValue, apiKey: ApiKeyValue, apiKey: ApiKeyValue, apiKey: ApiKeyValue): ApiRequest[PreferenceResponse] =
    ApiRequest[PreferenceResponse](ApiMethods.PUT, "https://virtserver.swaggerhub.com/SmartBear-CC/Natalie_TestAutoMock/1.0.0", "/guest/preferences/{id}", "application/json")
      .withApiKey(apiKey, "X-Body-Hash", HEADER)
      .withApiKey(apiKey, "X-Consumer-Key", HEADER)
      .withApiKey(apiKey, "X-HMAC", HEADER)
      .withApiKey(apiKey, "X-HMAC-Timestamp", HEADER)
      .withApiKey(apiKey, "X-HMAC-Version", HEADER)
      .withApiKey(apiKey, "X-Session-Uuid", HEADER)
      .withBody(preference)
      .withPathParam("id", id)
      .withSuccessResponse[PreferenceResponse](200)
      .withErrorResponse[Errors](400)
      .withErrorResponse[Errors](401)
        /**
   * 
   * 
   * Expected answers:
   *   code 200 : Seq[Any] (selected statuses)
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
   * @param id 
   * @param preferenceIds 
   */
  def guestPreferencesIdSelectAllPatch(id: Double, preferenceIds: PreferenceIds)(implicit apiKey: ApiKeyValue, apiKey: ApiKeyValue, apiKey: ApiKeyValue, apiKey: ApiKeyValue, apiKey: ApiKeyValue, apiKey: ApiKeyValue): ApiRequest[Seq[Any]] =
    ApiRequest[Seq[Any]](ApiMethods.PATCH, "https://virtserver.swaggerhub.com/SmartBear-CC/Natalie_TestAutoMock/1.0.0", "/guest/preferences/{id}/select_all", "application/json")
      .withApiKey(apiKey, "X-Body-Hash", HEADER)
      .withApiKey(apiKey, "X-Consumer-Key", HEADER)
      .withApiKey(apiKey, "X-HMAC", HEADER)
      .withApiKey(apiKey, "X-HMAC-Timestamp", HEADER)
      .withApiKey(apiKey, "X-HMAC-Version", HEADER)
      .withApiKey(apiKey, "X-Session-Uuid", HEADER)
      .withBody(preferenceIds)
      .withPathParam("id", id)
      .withSuccessResponse[Seq[Any]](200)
      .withErrorResponse[Errors](400)
      .withErrorResponse[Errors](401)
        /**
   * 
   * 
   * Expected answers:
   *   code 200 : InlineResponse20025 (select status)
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
   * @param id 
   */
  def guestPreferencesIdSelectPut(id: Double)(implicit apiKey: ApiKeyValue, apiKey: ApiKeyValue, apiKey: ApiKeyValue, apiKey: ApiKeyValue, apiKey: ApiKeyValue, apiKey: ApiKeyValue): ApiRequest[InlineResponse20025] =
    ApiRequest[InlineResponse20025](ApiMethods.PUT, "https://virtserver.swaggerhub.com/SmartBear-CC/Natalie_TestAutoMock/1.0.0", "/guest/preferences/{id}/select", "application/json")
      .withApiKey(apiKey, "X-Body-Hash", HEADER)
      .withApiKey(apiKey, "X-Consumer-Key", HEADER)
      .withApiKey(apiKey, "X-HMAC", HEADER)
      .withApiKey(apiKey, "X-HMAC-Timestamp", HEADER)
      .withApiKey(apiKey, "X-HMAC-Version", HEADER)
      .withApiKey(apiKey, "X-Session-Uuid", HEADER)
      .withPathParam("id", id)
      .withSuccessResponse[InlineResponse20025](200)
      .withErrorResponse[Errors](400)
      .withErrorResponse[Errors](401)
        /**
   * 
   * 
   * Expected answers:
   *   code 200 : Seq[Any] (unselected statuses)
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
   * @param id 
   * @param preferenceIds 
   */
  def guestPreferencesIdUnselectAllPatch(id: Double, preferenceIds: PreferenceIds1)(implicit apiKey: ApiKeyValue, apiKey: ApiKeyValue, apiKey: ApiKeyValue, apiKey: ApiKeyValue, apiKey: ApiKeyValue, apiKey: ApiKeyValue): ApiRequest[Seq[Any]] =
    ApiRequest[Seq[Any]](ApiMethods.PATCH, "https://virtserver.swaggerhub.com/SmartBear-CC/Natalie_TestAutoMock/1.0.0", "/guest/preferences/{id}/unselect_all", "application/json")
      .withApiKey(apiKey, "X-Body-Hash", HEADER)
      .withApiKey(apiKey, "X-Consumer-Key", HEADER)
      .withApiKey(apiKey, "X-HMAC", HEADER)
      .withApiKey(apiKey, "X-HMAC-Timestamp", HEADER)
      .withApiKey(apiKey, "X-HMAC-Version", HEADER)
      .withApiKey(apiKey, "X-Session-Uuid", HEADER)
      .withBody(preferenceIds)
      .withPathParam("id", id)
      .withSuccessResponse[Seq[Any]](200)
      .withErrorResponse[Errors](400)
      .withErrorResponse[Errors](401)
        /**
   * 
   * 
   * Expected answers:
   *   code 200 : InlineResponse20026 (select status)
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
   * @param id 
   */
  def guestPreferencesIdUnselectPut(id: Double)(implicit apiKey: ApiKeyValue, apiKey: ApiKeyValue, apiKey: ApiKeyValue, apiKey: ApiKeyValue, apiKey: ApiKeyValue, apiKey: ApiKeyValue): ApiRequest[InlineResponse20026] =
    ApiRequest[InlineResponse20026](ApiMethods.PUT, "https://virtserver.swaggerhub.com/SmartBear-CC/Natalie_TestAutoMock/1.0.0", "/guest/preferences/{id}/unselect", "application/json")
      .withApiKey(apiKey, "X-Body-Hash", HEADER)
      .withApiKey(apiKey, "X-Consumer-Key", HEADER)
      .withApiKey(apiKey, "X-HMAC", HEADER)
      .withApiKey(apiKey, "X-HMAC-Timestamp", HEADER)
      .withApiKey(apiKey, "X-HMAC-Version", HEADER)
      .withApiKey(apiKey, "X-Session-Uuid", HEADER)
      .withPathParam("id", id)
      .withSuccessResponse[InlineResponse20026](200)
      .withErrorResponse[Errors](400)
      .withErrorResponse[Errors](401)
        /**
   * 
   * 
   * Expected answers:
   *   code 200 : PreferenceResponse (preference)
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
   * @param preference 
   */
  def guestPreferencesPost(preference: Option[Preference1] = None)(implicit apiKey: ApiKeyValue, apiKey: ApiKeyValue, apiKey: ApiKeyValue, apiKey: ApiKeyValue, apiKey: ApiKeyValue, apiKey: ApiKeyValue): ApiRequest[PreferenceResponse] =
    ApiRequest[PreferenceResponse](ApiMethods.POST, "https://virtserver.swaggerhub.com/SmartBear-CC/Natalie_TestAutoMock/1.0.0", "/guest/preferences", "application/json")
      .withApiKey(apiKey, "X-Body-Hash", HEADER)
      .withApiKey(apiKey, "X-Consumer-Key", HEADER)
      .withApiKey(apiKey, "X-HMAC", HEADER)
      .withApiKey(apiKey, "X-HMAC-Timestamp", HEADER)
      .withApiKey(apiKey, "X-HMAC-Version", HEADER)
      .withApiKey(apiKey, "X-Session-Uuid", HEADER)
      .withBody(preference)
      .withSuccessResponse[PreferenceResponse](200)
      .withErrorResponse[Errors](400)
      .withErrorResponse[Errors](401)
      

}

