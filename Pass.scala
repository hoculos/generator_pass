import java.security.MessageDigest
import java.math.BigInteger
import scala.util.Random

protected class Pass(len: Int) {
  private val psw = Random.alphanumeric
    //magic...
  private val passwd = (psw take len).mkString

  //methods from alvinalexander.com
  private def md5Hash(s: String): String = {
    val md = MessageDigest.getInstance("MD5") //or etc...
    val digest = md.digest(s.getBytes)
    val bigInt = new BigInteger(1,digest)
    val hashedString = bigInt.toString(16)
    hashedString
  }

  //not secure!!!! only test
  def testPass(): String={
    passwd
  }
  def testMd5(): String={
    md5Hash(passwd)
  }
}