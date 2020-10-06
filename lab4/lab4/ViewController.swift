//
//  ViewController.swift
//  lab4
//
//  Created by Meriah MacKillip on 10/5/20.
//  Copyright © 2020 Meriah MacKillip. All rights reserved.
//

import UIKit

class ViewController: UIViewController, UITextFieldDelegate {
    
    @IBOutlet weak var plantTax: UITextField!
    @IBOutlet weak var plantPrice: UITextField!
    @IBOutlet weak var plantLabel: UILabel!
    @IBOutlet weak var plantStepper: UIStepper!
    @IBOutlet weak var totalPlantPrice: UILabel!
    @IBAction func displayAlert(_ sender: Any) {
        let alertController = UIAlertController(title: "Alert", message: "Alert! Alert!", preferredStyle: .alert)
        alertController.addAction(UIAlertAction(title: "Dismiss", style: .default))
        self.present(alertController, animated: true, completion: nil)
    }
    
    @IBAction func updatePlant(_ sender: UIStepper) {
        if plantStepper.value == 1{
            plantLabel.text = "1 Plant"
        }
        else{
            plantLabel.text = String(format: "%.0f", plantStepper.value) + " Plants"
        }
        updatePlantTotal()
    }
    
    func updatePlantTotal(){
        var plantAmount: Float
        var taxAmount: Float
        
        if plantPrice.text!.isEmpty {
            plantAmount = 0.0
        }
        else{
            plantAmount = Float(plantPrice.text!)!
        }
        if plantPrice.text!.isEmpty{
            taxAmount = 0.0
        }
        else{
            taxAmount = Float(plantTax.text!)! / 100
        }
        
        let numberOfPlants = plantStepper.value
        let plantNumbersThing = Float(numberOfPlants) * plantAmount
        let tax = plantNumbersThing * taxAmount
        let total = tax + plantNumbersThing
        
        let currenyConvert = NumberFormatter()
        currenyConvert.numberStyle = NumberFormatter.Style.currency
        totalPlantPrice.text = currenyConvert.string(from: NSNumber(value: total))
    }
    //@IBOutlet weak var plantAmount: UILabel!
    func textFieldShouldReturn(_ textField: UITextField) -> Bool {
        textField.resignFirstResponder()
        return true
    }
    
    func textFieldDidEndEditing(_ textField: UITextField) {
        updatePlantTotal()
    }
    
    
    override func viewDidLoad() {
        plantPrice.delegate = self
        plantTax.delegate = self
        super.viewDidLoad()
        // Do any additional setup after loading the view.
        NotificationCenter.default.addObserver(self, selector: #selector(keyboardWillShow), name: UIResponder.keyboardWillShowNotification, object: nil)
        NotificationCenter.default.addObserver(self, selector: #selector(keyboardWillHide), name: UIResponder.keyboardWillHideNotification, object: nil)
        let tap: UITapGestureRecognizer = UITapGestureRecognizer(target: self, action: #selector(self.dismissKeyboard))
        view.addGestureRecognizer(tap)
    }
    
    @objc func dismissKeyboard(){
        view.endEditing(true)
    }
    
    @objc func keyboardWillShow(notification:NSNotification){
        if let keyboardSize = (notification.userInfo?[UIResponder.keyboardFrameEndUserInfoKey] as? NSValue)?.cgRectValue{
            if self.view.frame.origin.y == 0{
                self.view.frame.origin.y -= keyboardSize.height
            }
        }
    }
    
    @objc func keyboardWillHide(notification: NSNotification){
        if((notification.userInfo?[UIResponder.keyboardFrameEndUserInfoKey] as? NSValue)?.cgRectValue) != nil{
            if self.view.frame.origin.y != 0 {
                self.view.frame.origin.y = 0
            }
        }
    }


}

