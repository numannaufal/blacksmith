//
//  SplashController.swift
//  forgery
//
//  Created by Nu'man on 20/08/22.
//

import UIKit

class SplashController: UIViewController {
    @IBOutlet var mascot: UIImageView!

    override func viewDidLoad() {
        super.viewDidLoad()
        mascot.image = UIImage(named: "Mascot")
        // Do any additional setup after loading the view.
    }
    

    /*
    // MARK: - Navigation

    // In a storyboard-based application, you will often want to do a little preparation before navigation
    override func prepare(for segue: UIStoryboardSegue, sender: Any?) {
        // Get the new view controller using segue.destination.
        // Pass the selected object to the new view controller.
    }
    */

}
