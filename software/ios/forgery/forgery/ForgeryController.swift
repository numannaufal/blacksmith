//
//  ForgeryController.swift
//  forgery
//
//  Created by Nu'man on 20/08/22.
//

import UIKit

class ForgeryController: UIViewController {
    @IBOutlet var label: UILabel!

    override func viewDidLoad() {
        super.viewDidLoad()
        let hammer: Tool = Tool(name: "Hammer")
        let observeChanges = hammer.$status.sink {
            self.label.text = "\(hammer.name). STATUS: \($0)"
        }
        
        label.text = hammer.name
        hammer.upgrade()
    }
}
