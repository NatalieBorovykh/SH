/**
 * NOTE: This class is auto generated by the akka-scala (beta) swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen
 * For any issue or feedback, please open a ticket via https://github.com/swagger-api/swagger-codegen/issues/new
 */

package io.swagger.client.model

import io.swagger.client.core.ApiModel
import org.joda.time.DateTime
import java.util.UUID

case class DeliverableCategory (
  id: Option[Long],
  name: Option[String],
  code: Option[String],
  displayOrder: Option[Long],
  children: Option[Seq[DeliverableCategory]],
  deliverables: Option[Seq[DeliverableResponse]],
  useCase: Option[String],
  parentId: Option[Long],
  createdAt: Option[String],
  updatedAt: Option[Long]
) extends ApiModel


