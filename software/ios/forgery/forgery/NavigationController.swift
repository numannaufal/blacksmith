//
//  ViewController.swift
//  forgery
//
//  Created by Nu'man on 20/08/22.
//

import UIKit

class NavigationController: UINavigationController {

    override func viewDidLoad() {
        super.viewDidLoad()
        print("navigation controller")
        DispatchQueue.main.asyncAfter(deadline: .now() + 3) {
            self.goToHome()
        }
    }
    
    func goToHome() {
        let storyBoard = UIStoryboard(name: "Main", bundle: nil)
        let homeController = storyBoard.instantiateViewController(withIdentifier: "HomeController") as! HomeController
        self.pushViewController(homeController, animated: true)
    }
}

