/**
 * NOTE: This class is auto generated by the akka-scala (beta) swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen
 * For any issue or feedback, please open a ticket via https://github.com/swagger-api/swagger-codegen/issues/new
 */

package io.swagger.client.model

import io.swagger.client.core.ApiModel
import org.joda.time.DateTime
import java.util.UUID

case class TransactionResponse (
  id: Option[Long],
  createdAt: Option[String],
  updatedAt: Option[String],
  state: Option[String],
  transactionType: Option[String],
  user: Option[UserResponse],
  venueId: Option[Long],
  checkinId: Option[Long],
  merchantId: Option[Long],
  checkoutRequestId: Option[Long],
  amount: Option[Float],
  currency: Option[String],
  externalId: Option[String],
  responseBody: Option[String],
  confirmationPdf: Option[String],
  errorMessage: Option[String]
) extends ApiModel


