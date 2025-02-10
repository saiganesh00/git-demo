# Git Commands and Collaboration Example

This guide briefly explains essential Git commands and demonstrates how two developers can collaborate on the same project using Git.

---

## Essential Git Commands

### 1. **Initialize a Repository**
```bash
git init
```
Initializes a new Git repository in the current directory.  
**Example**:  
```bash
git init
# Creates a new Git repository in the current folder.
```

---

### 2. **Clone a Repository**
```bash
git clone <repository-url>
```
Creates a local copy of a remote repository.  
**Example**:  
```bash
git clone https://github.com/user/repo.git
# Downloads the repository to your local machine.
```

---

### 3. **Check Status**
```bash
git status
```
Shows the status of your working directory (untracked, modified, or staged files).  
**Example**:  
```bash
git status
# Displays which files are modified, staged, or untracked.
```

---

### 4. **Add Files to Staging Area**
```bash
git add <file-name>
```
Stages a specific file for commit. Use `git add .` to stage all changes.  
**Example**:  
```bash
git add index.html
# Stages the `index.html` file for commit.
```

---

### 5. **Commit Changes**
```bash
git commit -m "Your commit message"
```
Saves staged changes with a descriptive message.  
**Example**:  
```bash
git commit -m "Add homepage layout"
# Commits the staged changes with a message.
```

---

### 6. **Push Changes to Remote**
```bash
git push origin <branch-name>
```
Uploads local commits to the remote repository.  
**Example**:  
```bash
git push origin main
# Pushes local commits to the `main` branch on the remote repository.
```

---

### 7. **Pull Latest Changes**
```bash
git pull origin <branch-name>
```
Fetches and merges changes from the remote repository to your local branch.  
**Example**:  
```bash
git pull origin main
# Updates your local branch with the latest changes from the remote `main` branch.
```

---

### 8. **Create a New Branch**
```bash
git checkout -b <branch-name>
```
Creates and switches to a new branch.  
**Example**:  
```bash
git checkout -b feature-login
# Creates and switches to a new branch called `feature-login`.
```

---

### 9. **Switch Branches**
```bash
git checkout <branch-name>
```
Switches to an existing branch.  
**Example**:  
```bash
git checkout main
# Switches to the `main` branch.
```

---

### 10. **Merge Branches**
```bash
git merge <branch-name>
```
Merges changes from one branch into the current branch.  
**Example**:  
```bash
git merge feature-login
# Merges changes from `feature-login` into the current branch.
```

---

### 11. **View Commit History**
```bash
git log
```
Displays the commit history for the current branch.  
**Example**:  
```bash
git log
# Shows a list of commits with details like author, date, and message.
```

---

## Collaboration Example: Two Developers Working on the Same Project

### Scenario:
- **Developer A** and **Developer B** are working on a project hosted on GitHub.
- The project has a `main` branch.
- Both developers will create separate branches for their features.

---

### Steps:

1. **Developer A** clones the repository:
   ```bash
   git clone https://github.com/user/repo.git
   ```

2. **Developer A** creates a new branch for their feature:
   ```bash
   git checkout -b feature-header
   ```

3. **Developer A** makes changes, stages, and commits:
   ```bash
   git add header.html
   git commit -m "Add header section"
   ```

4. **Developer A** pushes their branch to the remote repository:
   ```bash
   git push origin feature-header
   ```

5. **Developer B** clones the repository (if not already done):
   ```bash
   git clone https://github.com/user/repo.git
   ```

6. **Developer B** creates a new branch for their feature:
   ```bash
   git checkout -b feature-footer
   ```

7. **Developer B** makes changes, stages, and commits:
   ```bash
   git add footer.html
   git commit -m "Add footer section"
   ```

8. **Developer B** pushes their branch to the remote repository:
   ```bash
   git push origin feature-footer
   ```

9. **Developer A** creates a Pull Request (PR) for their `feature-header` branch:
   - Go to GitHub, select the `feature-header` branch, and click "New Pull Request."
   - Add a description and submit the PR.

10. **Developer B** creates a Pull Request (PR) for their `feature-footer` branch:
    - Go to GitHub, select the `feature-footer` branch, and click "New Pull Request."
    - Add a description and submit the PR.

11. **Maintainer** reviews and merges the PRs:
    - The maintainer reviews the changes, approves, and merges `feature-header` and `feature-footer` into the `main` branch.

12. Both developers pull the latest changes from `main`:
    ```bash
    git checkout main
    git pull origin main
    ```

13. Both developers delete their feature branches (optional):
    ```bash
    git branch -d feature-header
    git branch -d feature-footer
    ```

---

## Key Takeaways
- Always work on separate branches for new features.
- Pull the latest changes from `main` frequently to avoid conflicts.
- Use clear commit messages and PR descriptions for better collaboration.

Happy coding! 🚀