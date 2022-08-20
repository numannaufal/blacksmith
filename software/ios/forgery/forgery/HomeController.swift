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
        print("clicked MAN!")
        self.goToForgery()
    }
    
    func goToForgery() {
        let storyBoard = UIStoryboard(name: "Main", bundle: nil)
        let forgeryController = storyBoard.instantiateViewController(withIdentifier: "ForgeryController") as! ForgeryController
        self.navigationController?.pushViewController(forgeryController, animated: true)
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
