package cl.ravenhill.http

def networkStatus(status: Any): String = status match
  case 200 | 201 | 204 => "Success"
  case 400 => "Bad Request"
  case 404 => "Not Found"
  case 500 => "Internal Server Error"
  case "timeout" => "The request timed out"
  case status: Int => s"Unhandled status code: $status"
  case status: String => s"Unhandled string: $status"
end networkStatus

@main def networkStatusExample(): Unit =
  println(networkStatus(200)) // Prints: Success
  println(networkStatus(404)) // Prints: Not Found
  println(networkStatus(500)) // Prints: Internal Server Error
  println(networkStatus("timeout")) // Prints: The request timed out
  println(networkStatus("unknown")) // Prints: Unhandled string: unknown
  println(networkStatus(999)) // Prints: Unhandled status code: 999
  println(networkStatus(Object()))
end networkStatusExample
