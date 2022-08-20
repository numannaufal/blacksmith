//
//  HomeController.swift
//  forgery
//
//  Created by Nu'man on 20/08/22.
//

import UIKit

class HomeController: UIViewController {
    @IBOutlet var mascot: UIImageView!
    @IBOutlet var upgrade_button: UIButton!

    override func viewDidLoad() {
        super.viewDidLoad()
        mascot.image = UIImage(named: "Mascot")
    }
    
    @IBAction func clickNextButton(_ sender: UIButton) {
        let navController = self.navigationController as! NavigationController
        navController.goToForgery()
    }
    
}
