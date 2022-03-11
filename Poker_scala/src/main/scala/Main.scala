import scala.math.Ordering

object Poker:

  enum PlayingCard :
    case 2
    case 3
    case 4
    case 5
    case 6
    case 7
    case 8
    case 9
    case 10
    case J
    case Q
    case K
    case A

  enum Color :
    case HEART //coeur
    case SPADE //pique
    case CLUB //trèfle
    case DIAMOND //carreau

  enum pokerCard :
    case ph(pc:PlayingCard,col: Color)


  def pokerHand(s: String): BloodGroup = s match
    case "AH" => pokerHand.ph(playingCard.A, color.HEART);
    case "B+" => BloodGroup.BG(ABO.B,RHESUS.+);
    case "AB+" => BloodGroup.BG(ABO.AB,RHESUS.+);
    case "O+" => BloodGroup.BG(ABO.O,RHESUS.+);
    case "A-" => BloodGroup.BG(ABO.A,RHESUS.-);
    case "B-" => BloodGroup.BG(ABO.B,RHESUS.-);
    case "AB-" => BloodGroup.BG(ABO.AB,RHESUS.-);
    case "O-" => BloodGroup.BG(ABO.O,RHESUS.-);
    case _ => throw new IllegalArgumentException

  @main def mainPoker =
    println("Hello, world!")
