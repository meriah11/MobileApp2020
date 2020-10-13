//
//  ViewController.swift
//  recipeApp
//
//  Created by Meriah MacKillip on 10/3/20.
//  Copyright © 2020 Meriah MacKillip. All rights reserved.
//

import UIKit
import SafariServices

class ViewController: UIViewController {
    //button outlets
    @IBOutlet weak var button1: UIButton!
    @IBOutlet weak var button2: UIButton!
    @IBOutlet weak var button3: UIButton!
    @IBOutlet weak var button4: UIButton!
    
    //image outlets
    @IBOutlet weak var image1: UIImageView!
    @IBOutlet weak var image2: UIImageView!
    @IBOutlet weak var image3: UIImageView!
    @IBOutlet weak var image4: UIImageView!
    
    //segmented control outlet
    @IBOutlet weak var segControl: UISegmentedControl!
    
    //segmented control
    @IBAction func mealSegmentedControl(_ sender: UISegmentedControl) {
        if sender.selectedSegmentIndex == 0 {
            button1.setTitle("Chicken Parmesan", for: .normal)
            button2.setTitle("OrangeChicken", for: .normal)
            button3.setTitle("Garlic Chicken", for: .normal)
            button4.setTitle("Chicken Breast", for: .normal)
            
            image1.image = UIImage(named: "chickenParm")
            image2.image = UIImage(named: "orangeChicken")
            image3.image = UIImage(named: "garlicChiken")
            image4.image = UIImage(named: "breast")
            
        }
        if sender.selectedSegmentIndex == 1 {
            button1.setTitle("Cajun Shrimp", for: .normal)
            button2.setTitle("Fried Shrimp", for: .normal)
            button3.setTitle("Salmon", for: .normal)
            button4.setTitle("Fish Sandwich", for: .normal)
            
            image1.image = UIImage(named: "cajunShrimp")
            image2.image = UIImage(named: "friedShrimp")
            image3.image = UIImage(named: "salmon")
            image4.image = UIImage(named: "sandwich")
        }
        if sender.selectedSegmentIndex == 2 {
            button1.setTitle("Pesto", for: .normal)
            button2.setTitle("Spaghetti", for: .normal)
            button3.setTitle("Butter Noodles", for: .normal)
            button4.setTitle("Linguini With Lemon", for: .normal)
            
            image1.image = UIImage(named: "pesto")
            image2.image = UIImage(named: "spaghetti")
            image3.image = UIImage(named: "butterNoodles")
            image4.image = UIImage(named: "lemonPasta")
        }
        if sender.selectedSegmentIndex == 3 {
            button1.setTitle("Steak", for: .normal)
            button2.setTitle("Cheeseburger", for: .normal)
            button3.setTitle("Steak Fajitas", for: .normal)
            button4.setTitle("Broccoli Beef", for: .normal)
            
            image1.image = UIImage(named: "steak")
            image2.image = UIImage(named: "cheeseburger")
            image3.image = UIImage(named: "fajitas")
            image4.image = UIImage(named: "broccoli")
        }
    }
    
    
    
    //button functions that change with the segmented control index
    @IBAction func chickenParmClicked(_ sender: UIButton) {
        if segControl.selectedSegmentIndex == 0{
            //youtube tutorial for opening safari through app https://www.youtube.com/watch?v=gnjXbR2eNDE
        safariOpen(for: "https://www.allrecipes.com/recipe/223042/chicken-parmesan/")
        }
        if segControl.selectedSegmentIndex == 1 {
            safariOpen(for: "https://www.crazyforcrust.com/cajun-shrimp/")
        }
        if segControl.selectedSegmentIndex == 2 {
            safariOpen(for: "https://www.allrecipes.com/recipe/11887/pesto-pasta/")
        }
        if segControl.selectedSegmentIndex == 3 {
            safariOpen(for: "https://natashaskitchen.com/pan-seared-steak/")
        }
        
    }
    
    @IBAction func orangeChickenClicked(_ sender: UIButton) {
        if segControl.selectedSegmentIndex == 0 {
            safariOpen(for: "https://dinnerthendessert.com/panda-express-orange-chicken-copycat/")
        }
        if segControl.selectedSegmentIndex == 1 {
            safariOpen(for: "https://www.dinneratthezoo.com/fried-shrimp-recipe/")
        }
        if segControl.selectedSegmentIndex == 2 {
            safariOpen(for: "https://www.inspiredtaste.net/38940/spaghetti-with-meat-sauce-recipe/")
        }
        if segControl.selectedSegmentIndex == 3 {
            safariOpen(for: "https://life-in-the-lofthouse.com/in-n-out-cheeseburger/")
        }
        
        
    }
    
    @IBAction func garlicChickenClicked(_ sender: UIButton) {
        if segControl.selectedSegmentIndex == 0{
        safariOpen(for: "https://cafedelites.com/creamy-garlic-chicken-breasts/")
        }
        if segControl.selectedSegmentIndex == 1{
        safariOpen(for: "https://cafedelites.com/sheet-pan-garlic-butter-baked-salmon/")
        }
        if segControl.selectedSegmentIndex == 2{
        safariOpen(for: "https://www.delish.com/cooking/recipe-ideas/a25636049/buttered-noodles-recipe/")
        }
        if segControl.selectedSegmentIndex == 3{
        safariOpen(for: "https://www.simplyrecipes.com/recipes/steak_fajitas/")
        }
        
    }
    
    @IBAction func chickenClicked(_ sender: UIButton) {
        if segControl.selectedSegmentIndex == 0 {
            safariOpen(for: "https://cafedelites.com/oven-baked-chicken-breast/")
        }
        if segControl.selectedSegmentIndex == 1 {
            safariOpen(for: "https://www.epicurious.com/recipes/food/views/crispy-fish-sandwich")
        }
        if segControl.selectedSegmentIndex == 2 {
            safariOpen(for: "https://cooking.nytimes.com/recipes/1589-linguine-with-lemon-sauce")
        }
        if segControl.selectedSegmentIndex == 3 {
            safariOpen(for: "https://www.justataste.com/easy-beef-and-broccoli-recipe/")
        }
        
    }
    
    
    
    
    
    override func viewDidLoad() {
        super.viewDidLoad()
        // Do any additional setup after loading the view.
    }
    
    func safariOpen(for url: String){
        guard let url = URL(string: url) else{
            return
            //this will be called if an invalid URL appears
        }
        
        let safari = SFSafariViewController(url: url)
        present(safari, animated: true, completion: nil)
    }


}

