//
//  HomeViewController.swift
//  nami
//
//  Created by Nu'man on 10/08/22.
//

import UIKit

class HomeViewController: UIViewController {
    @IBOutlet var home_label: UILabel!
    @IBOutlet var home_button: UIButton!
    var source: String!

    override func viewDidLoad() {
        super.viewDidLoad()
        print("home view controller")
        print("source")
        print(source)
        if home_label != nil {
            home_label.text = "Home Label"
        }
       
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
