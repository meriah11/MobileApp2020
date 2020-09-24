//
//  ViewController.swift
//  Lab3
//
//  Created by Meriah MacKillip on 9/23/20.
//  Copyright © 2020 Meriah MacKillip. All rights reserved.
//

import UIKit

class ViewController: UIViewController {

    @IBOutlet weak var candleImage: UIImageView!
    
    @IBOutlet weak var candleTitle: UILabel!
    
    @IBOutlet weak var lableSizeChange: UILabel!
    
    @IBOutlet weak var fontSlider: UISlider!
    @IBOutlet weak var capitalSwitch: UISwitch!
    
    @IBAction func candleSlider(_ sender: UISegmentedControl) {
        if sender.selectedSegmentIndex == 0{
            candleImage.image = UIImage(named: "champagne")
            candleTitle.text = "This candle smells sweet"
            candleTitle.textColor = UIColor.magenta
        }
        if sender.selectedSegmentIndex == 1{
            candleImage.image = UIImage(named: "mahogany")
            candleTitle.text = "This candle smells like cologne"
            candleTitle.textColor = UIColor.brown
        }
    }
    
    @IBAction func updateFont(_ sender: UISwitch) {
        if sender.isOn{
            candleTitle.text = candleTitle.text?.uppercased()
        }
        else{
            candleTitle.text = candleTitle.text?.lowercased()
        }
    }
    
    @IBAction func changeTextSize(_ sender: UISlider) {
        let fontSize = sender.value
        
        lableSizeChange.text = String(format: "%.0f", fontSize )
        
        let fontSizeCGFloat = CGFloat(fontSize)
        candleTitle.font = UIFont.systemFont(ofSize: fontSizeCGFloat)
        
    }
    
    override func viewDidLoad() {
        super.viewDidLoad()
        // Do any additional setup after loading the view.
    }


}
