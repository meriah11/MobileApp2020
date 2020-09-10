//
//  ViewController.swift
//  Lab1
//
//  Created by Meriah MacKillip on 9/8/20.
//  Copyright © 2020 Meriah MacKillip. All rights reserved.
//

import UIKit

class ViewController: UIViewController {
    @IBOutlet weak var applesOrangesImage: UIImageView!
    @IBOutlet weak var titleChange: UILabel!
    
    @IBAction func applesRule(_ sender: UIButton) {
        if sender.tag == 1{
            applesOrangesImage.image = UIImage(named: "apple")
            titleChange.text = "Apples... Nice"
        }
        else{
            applesOrangesImage.image = UIImage(named: "orange")
            titleChange.text = "Oranges... Nice"
        }
    }
    override func viewDidLoad() {
        super.viewDidLoad()
        // Do any additional setup after loading the view.
    }


}

