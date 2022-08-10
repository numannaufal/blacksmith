//
//  HomeViewController.swift
//  workshop
//
//  Created by Nu'man on 10/08/22.
//

import UIKit

class HomeViewController: UIViewController {
    @IBOutlet var home_label: UILabel!

    override func viewDidLoad() {
        super.viewDidLoad()
        home_label.text = "Home Blacksmith FORGERY MAN"
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
