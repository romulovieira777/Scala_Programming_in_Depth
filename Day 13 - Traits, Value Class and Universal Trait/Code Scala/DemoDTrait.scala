// written by xyz developer,
// open source,
// whenever you extend CarD, you should also extend FourWheelerD and VehicleD
abstract class VehicleD{
}

trait FourWheelerD {
}

trait CarD {
  this: FourWheelerD with VehicleD =>{   // if you extend CarD, make sure you also extend FourWheelerD
                                      // and VehicleD
  }
}

// written by abc developer
class MercedesD extends VehicleD with FourWheelerD with CarD {
}

object DemoDTrait {
  def main(args: Array[String]): Unit = {
    val m1 = new MercedesD
  }
}