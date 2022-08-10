//
//  EndPathViewController.swift
//  nami
//
//  Created by Nu'man on 10/08/22.
//

import UIKit

class EndPathViewController: UIViewController {
    @IBOutlet var screen_label: UILabel!
    @IBOutlet var screen_button: UIButton!

    override func viewDidLoad() {
        super.viewDidLoad()
        screen_label.text = "End Path Label"
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
