//
//  NavigatorController.swift
//  workshop
//
//  Created by Nu'man on 10/08/22.
//

import UIKit

class NavigatorController: UINavigationController {

    override func viewDidLoad() {
        super.viewDidLoad()
        print("woi")
        if let viewController = UIStoryboard(name: "Main", bundle: nil).instantiateViewController(withIdentifier: "ViewController") as? ViewController {
               if let navigator = navigationController {
                   navigator.pushViewController(viewController, animated: true)
               }
           }

    }
//
//    override func prepare(for segue: UIStoryboardSegue, sender: Any?) {
//        // Get the new view controller using segue.destination.
//        // Pass the selected object to the new view controller.
//        let destinationNavigationController = segue.destination as! UINavigationController
//        let targetController = destinationNavigationController.topViewController
//
//    }
    

    /*
    // MARK: - Navigation

    // In a storyboard-based application, you will often want to do a little preparation before navigation
    override func prepare(for segue: UIStoryboardSegue, sender: Any?) {
        // Get the new view controller using segue.destination.
        // Pass the selected object to the new view controller.
    }
    */

}
