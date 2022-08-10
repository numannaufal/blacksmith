//
//  ViewController.swift
//  workshop
//
//  Created by Nu'man on 10/08/22.
//

import UIKit

class ViewController: UIViewController {
    @IBOutlet var title_label: UILabel!
    @IBOutlet var mascot: UIImageView!
    @IBOutlet var next_button: UIButton!

    override func viewDidLoad() {
        super.viewDidLoad()
        title_label.text = "Blacksmith"
        mascot.image = UIImage(named: "Mascot")
    }
    
    @IBAction func clickNextButton(_ sender: UIButton) {
        print("clicked MAN!")
    }
}

