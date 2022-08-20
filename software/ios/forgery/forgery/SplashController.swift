//
//  SplashController.swift
//  forgery
//
//  Created by Nu'man on 20/08/22.
//

import UIKit

class SplashController: UIViewController {
    @IBOutlet var mascot: UIImageView!
    @IBOutlet var label: UILabel!
    
    private var hasWelcome: Bool!

    override func viewDidLoad() {
        super.viewDidLoad()
        mascot.image = UIImage(named: "Mascot")
        label.text = "Welcome to blacksmith!!! Wait a moment..."
        
        DispatchQueue.main.asyncAfter(deadline: .now() + 3) {
            self.label.text = "..."
            (self.navigationController as! NavigationController).goToHome()
            self.hasWelcome = true
        }
    }
    
    override func viewDidAppear(_ animated: Bool) {
        super.viewDidAppear(true)
        if hasWelcome == true {
            label.text = "See you again!!!"
            DispatchQueue.main.asyncAfter(deadline: .now() + 1.5) {
                (self.navigationController as! NavigationController).quit()
            }
        }
    }
}
