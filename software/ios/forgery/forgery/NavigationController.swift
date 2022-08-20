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
    }
    
    func goToHome() {
        self.goTo(id: "HomeController", Controller: HomeController())
    }
    
    func goToForgery() {
        self.goTo(id: "ForgeryController", Controller: ForgeryController())
    }
    
    func goTo<T>(id: String, Controller: T) {
        let aViewController = self.getController(
            controllerIdentifier: id,
            Controller: T.self
        )
        self.pushViewController(aViewController, animated: true)
    }
    
    func getController<T>(controllerIdentifier: String, Controller: T) -> UIViewController {
        let storyBoard = UIStoryboard(name: "Main", bundle: nil)
        return storyBoard.instantiateViewController(withIdentifier: controllerIdentifier)
    }
    
    func quit() {
        exit(0)
    }
}

