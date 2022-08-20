//
//  Tool.swift
//  forgery
//
//  Created by Nu'man on 20/08/22.
//

import UIKit

class Tool: ObservableObject {
    @Published var name: String
    @Published var status: String
    
    
    init (name: String) {
        self.name = name
        self.status = "initial"
    }
    
    func upgrade() {
        self.status = "in progress";
    }
    
    func done() {
        self.status = "done";
    }
}
