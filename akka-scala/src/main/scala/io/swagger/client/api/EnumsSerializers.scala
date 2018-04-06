/**
 * NOTE: This class is auto generated by the akka-scala (beta) swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen
 * For any issue or feedback, please open a ticket via https://github.com/swagger-api/swagger-codegen/issues/new
 */
package io.swagger.client.api

import io.swagger.client.model._
import org.json4s._
import scala.reflect.ClassTag

object EnumsSerializers {

  def all = Seq[Serializer[_]]() :+
    new EnumNameSerializer(CreditcardCreateRequestEnums.Provider) :+
    new EnumNameSerializer(FilterAndSortingEnums.Sort) :+
    new EnumNameSerializer(InlineResponse20017Enums.Status) :+
    new EnumNameSerializer(MobileKeyResponseEnums.Provider) :+
    new EnumNameSerializer(MobileKeyResponseEnums.Status) :+
    new EnumNameSerializer(PrecheckinRequestRequestEnums.ArriveTime) :+
    new EnumNameSerializer(PrecheckinRequestRequestEnums.TravelPurpose) :+
    new EnumNameSerializer(PrecheckinRequestRequestEnums.ComingFrom) :+
    new EnumNameSerializer(StatusEnums.Status) :+
    new EnumNameSerializer(TrackinResponseEnums.Status) :+
    new EnumNameSerializer(UserNotificationResponseEnums.&#x60;Type&#x60;) :+
    new EnumNameSerializer(VenueCardResponseEnums.Category)



  private class EnumNameSerializer[E <: Enumeration: ClassTag](enum: E)
    extends Serializer[E#Value] {
    import JsonDSL._

    val EnumerationClass = classOf[E#Value]

    def deserialize(implicit format: Formats):
    PartialFunction[(TypeInfo, JValue), E#Value] = {
      case (t @ TypeInfo(EnumerationClass, _), json) if isValid(json) => {
        json match {
          case JString(value) =>
            enum.withName(value)
          case value =>
            throw new MappingException(s"Can't convert $value to $EnumerationClass")
        }
      }
    }

    private[this] def isValid(json: JValue) = json match {
      case JString(value) if enum.values.exists(_.toString == value) => true
      case _ => false
    }

    def serialize(implicit format: Formats): PartialFunction[Any, JValue] = {
      case i: E#Value => i.toString
    }
  }

}
